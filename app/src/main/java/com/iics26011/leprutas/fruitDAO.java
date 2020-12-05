package com.iics26011.leprutas;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface fruitDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(fruit fruit);

    @Query("SELECT * FROM fruit_table ORDER BY name ASC")
    LiveData<List<fruit>> getFruits();

    @Query("SELECT * FROM fruit_table WHERE isLiked ORDER BY name ASC")
    LiveData<List<fruit>> getLikedFruits();

    @Update
    void update(fruit fruit);

    @Query("DELETE FROM fruit_table")
    void deleteAll();
}
