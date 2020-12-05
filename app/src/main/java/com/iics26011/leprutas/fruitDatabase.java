package com.iics26011.leprutas;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {fruit.class}, version = 1, exportSchema = false)
public abstract class fruitDatabase extends RoomDatabase {

    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);
    private static volatile fruitDatabase INSTANCE;
    private static final RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            databaseWriteExecutor.execute(() -> {
                fruitDAO dao = INSTANCE.fruitDAO();
                dao.deleteAll();

                fruit Durian = new fruit(
                        R.drawable.durian,
                        "Durian",
                        "Durio zibethinus",
                        "The Durian fruit is usually large (up to one foot long) with a spiky, hard exterior, custard-like flesh, large seeds, and a strong odor. Durian fruit is usually available in several countries, especially in Southeast Asia  and is regarded as one of the healthiest fruits.",
                        "masaya ang buhay",
                        "alam mo ba"
                );
                dao.insert(Durian);

                fruit Oys = new fruit(
                        R.drawable.durian,
                        "oys",
                        "oysseus leviticus",
                        "the bomb",
                        "cutiepatootie",
                        "secret"
                );
                dao.insert(Oys);

                fruit Roy = new fruit(
                        R.drawable.durian,
                        "roy",
                        "roysseus escandalus",
                        "periodism",
                        "???",
                        "i like my dicc"
                );
                dao.insert(Roy);

            });
        }
    };

    static fruitDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (fruitDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            fruitDatabase.class, "fruit_database")
                            .addCallback(sRoomDatabaseCallback).build();
                }
            }
        }
        return INSTANCE;
    }

    public abstract fruitDAO fruitDAO();

}
