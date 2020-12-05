package com.iics26011.leprutas;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class fruitViewModel extends AndroidViewModel {

    private final fruitRepository fruitRepository;

    public fruitViewModel(Application application) {
        super(application);
        fruitRepository = new fruitRepository(application);
    }

    LiveData<List<fruit>> getFruits() {
        return fruitRepository.getFruits();
    }

    LiveData<List<fruit>> getLikedFruits() {
        return fruitRepository.getLikedFruits();
    }

    public void insert(fruit fruit) {
        fruitRepository.insert(fruit);
    }

    public void update(fruit fruit) {
        fruitRepository.update(fruit);
    }

    public void deletAll() {
        fruitRepository.deleteAll();
    }

}
