package com.iics26011.leprutas;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class fruitRepository {

    private fruitDAO fruitDAO;
    private LiveData<List<fruit>> fruits, likedFruits;

    fruitRepository(Application application) {
        fruitDatabase db = fruitDatabase.getDatabase(application);
        fruitDAO = db.fruitDAO();
        fruits = fruitDAO.getFruits();
        likedFruits = fruitDAO.getLikedFruits();
    }

    LiveData<List<fruit>> getFruits() {
        return fruits;
    }
    LiveData<List<fruit>> getLikedFruits() { return likedFruits; }

    void insert(fruit fruit) {
        fruitDatabase.databaseWriteExecutor.execute(() -> {
            fruitDAO.insert(fruit);
        });
    }

    void update(fruit fruit) {
        fruitDatabase.databaseWriteExecutor.execute(() -> {
            fruitDAO.update(fruit);
        });
    }

    void deleteAll() {
        fruitDatabase.databaseWriteExecutor.execute(() -> {
            fruitDAO.deleteAll();
        });
    }

}
