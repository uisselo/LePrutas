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

                fruit Durian = new fruit();
                Durian.setImage(R.drawable.durian);
                Durian.setName("Durian");
                Durian.setSciName("Durio zibethinus");
                Durian.setDesc("The Durian fruit is usually large (up to one foot long) with a spiky, hard exterior, custard-like flesh, large seeds, and a strong odor. Durian fruit is usually available in several countries, especially in Southeast Asia  and is regarded as one of the healthiest fruits.");
                Durian.setHb1("May improve Digestive Health");
                Durian.setHb2("May help prevent cardiovascular diseases");
                Durian.setHb3("May help maintain blood sugar levels");
                Durian.setHb4("May help regulate blood pressure levels");
                Durian.setHb5("May help delay aging");
                Durian.setTrv1("Known as the King of the Fruits");
                Durian.setTrv2("Banned in airplanes, hotels, and public places because of its pungent smell");
                dao.insert(Durian);

                fruit Mangosteen = new fruit();
                Mangosteen.setImage(R.drawable.durian);
                Mangosteen.setName("Durian");
                Mangosteen.setSciName("Durio zibethinus");
                Mangosteen.setDesc("The Durian fruit is usually large (up to one foot long) with a spiky, hard exterior, custard-like flesh, large seeds, and a strong odor. Durian fruit is usually available in several countries, especially in Southeast Asia  and is regarded as one of the healthiest fruits.");
                Mangosteen.setHb1("May improve Digestive Health");
                Mangosteen.setHb2("May help prevent cardiovascular diseases");
                Mangosteen.setHb3("May help maintain blood sugar levels");
                Mangosteen.setHb4("May help regulate blood pressure levels");
                Mangosteen.setHb5("May help delay aging");
                Mangosteen.setTrv1("Known as the King of the Fruits");
                Mangosteen.setTrv2("Banned in airplanes, hotels, and public places because of its pungent smell");
                dao.insert(Mangosteen);

                fruit Rambutan = new fruit();
                Rambutan.setImage(R.drawable.durian);
                Rambutan.setName("Durian");
                Rambutan.setSciName("Durio zibethinus");
                Rambutan.setDesc("The Durian fruit is usually large (up to one foot long) with a spiky, hard exterior, custard-like flesh, large seeds, and a strong odor. Durian fruit is usually available in several countries, especially in Southeast Asia  and is regarded as one of the healthiest fruits.");
                Rambutan.setHb1("May improve Digestive Health");
                Rambutan.setHb2("May help prevent cardiovascular diseases");
                Rambutan.setHb3("May help maintain blood sugar levels");
                Rambutan.setHb4("May help regulate blood pressure levels");
                Rambutan.setHb5("May help delay aging");
                Rambutan.setTrv1("Known as the King of the Fruits");
                Rambutan.setTrv2("Banned in airplanes, hotels, and public places because of its pungent smell");
                dao.insert(Rambutan);

                fruit DragonFruit = new fruit();
                DragonFruit.setImage(R.drawable.durian);
                DragonFruit.setName("Durian");
                DragonFruit.setSciName("Durio zibethinus");
                DragonFruit.setDesc("The Durian fruit is usually large (up to one foot long) with a spiky, hard exterior, custard-like flesh, large seeds, and a strong odor. Durian fruit is usually available in several countries, especially in Southeast Asia  and is regarded as one of the healthiest fruits.");
                DragonFruit.setHb1("May improve Digestive Health");
                DragonFruit.setHb2("May help prevent cardiovascular diseases");
                DragonFruit.setHb3("May help maintain blood sugar levels");
                DragonFruit.setHb4("May help regulate blood pressure levels");
                DragonFruit.setHb5("May help delay aging");
                DragonFruit.setTrv1("Known as the King of the Fruits");
                DragonFruit.setTrv2("Banned in airplanes, hotels, and public places because of its pungent smell");
                dao.insert(DragonFruit);

                fruit Pomelo = new fruit();
                Pomelo.setImage(R.drawable.durian);
                Pomelo.setName("Durian");
                Pomelo.setSciName("Durio zibethinus");
                Pomelo.setDesc("The Durian fruit is usually large (up to one foot long) with a spiky, hard exterior, custard-like flesh, large seeds, and a strong odor. Durian fruit is usually available in several countries, especially in Southeast Asia  and is regarded as one of the healthiest fruits.");
                Pomelo.setHb1("May improve Digestive Health");
                Pomelo.setHb2("May help prevent cardiovascular diseases");
                Pomelo.setHb3("May help maintain blood sugar levels");
                Pomelo.setHb4("May help regulate blood pressure levels");
                Pomelo.setHb5("May help delay aging");
                Pomelo.setTrv1("Known as the King of the Fruits");
                Pomelo.setTrv2("Banned in airplanes, hotels, and public places because of its pungent smell");
                dao.insert(Pomelo);

                fruit Lanzones = new fruit();
                Lanzones.setImage(R.drawable.durian);
                Lanzones.setName("Durian");
                Lanzones.setSciName("Durio zibethinus");
                Lanzones.setDesc("The Durian fruit is usually large (up to one foot long) with a spiky, hard exterior, custard-like flesh, large seeds, and a strong odor. Durian fruit is usually available in several countries, especially in Southeast Asia  and is regarded as one of the healthiest fruits.");
                Lanzones.setHb1("May improve Digestive Health");
                Lanzones.setHb2("May help prevent cardiovascular diseases");
                Lanzones.setHb3("May help maintain blood sugar levels");
                Lanzones.setHb4("May help regulate blood pressure levels");
                Lanzones.setHb5("May help delay aging");
                Lanzones.setTrv1("Known as the King of the Fruits");
                Lanzones.setTrv2("Banned in airplanes, hotels, and public places because of its pungent smell");
                dao.insert(Lanzones);

                fruit Mango = new fruit();
                Mango.setImage(R.drawable.durian);
                Mango.setName("Durian");
                Mango.setSciName("Durio zibethinus");
                Mango.setDesc("The Durian fruit is usually large (up to one foot long) with a spiky, hard exterior, custard-like flesh, large seeds, and a strong odor. Durian fruit is usually available in several countries, especially in Southeast Asia  and is regarded as one of the healthiest fruits.");
                Mango.setHb1("May improve Digestive Health");
                Mango.setHb2("May help prevent cardiovascular diseases");
                Mango.setHb3("May help maintain blood sugar levels");
                Mango.setHb4("May help regulate blood pressure levels");
                Mango.setHb5("May help delay aging");
                Mango.setTrv1("Known as the King of the Fruits");
                Mango.setTrv2("Banned in airplanes, hotels, and public places because of its pungent smell");
                dao.insert(Mango);

                fruit Jackfruit = new fruit();
                Jackfruit.setImage(R.drawable.durian);
                Jackfruit.setName("Durian");
                Jackfruit.setSciName("Durio zibethinus");
                Jackfruit.setDesc("The Durian fruit is usually large (up to one foot long) with a spiky, hard exterior, custard-like flesh, large seeds, and a strong odor. Durian fruit is usually available in several countries, especially in Southeast Asia  and is regarded as one of the healthiest fruits.");
                Jackfruit.setHb1("May improve Digestive Health");
                Jackfruit.setHb2("May help prevent cardiovascular diseases");
                Jackfruit.setHb3("May help maintain blood sugar levels");
                Jackfruit.setHb4("May help regulate blood pressure levels");
                Jackfruit.setHb5("May help delay aging");
                Jackfruit.setTrv1("Known as the King of the Fruits");
                Jackfruit.setTrv2("Banned in airplanes, hotels, and public places because of its pungent smell");
                dao.insert(Jackfruit);

                fruit Guava = new fruit();
                Guava.setImage(R.drawable.durian);
                Guava.setName("Durian");
                Guava.setSciName("Durio zibethinus");
                Guava.setDesc("The Durian fruit is usually large (up to one foot long) with a spiky, hard exterior, custard-like flesh, large seeds, and a strong odor. Durian fruit is usually available in several countries, especially in Southeast Asia  and is regarded as one of the healthiest fruits.");
                Guava.setHb1("May improve Digestive Health");
                Guava.setHb2("May help prevent cardiovascular diseases");
                Guava.setHb3("May help maintain blood sugar levels");
                Guava.setHb4("May help regulate blood pressure levels");
                Guava.setHb5("May help delay aging");
                Guava.setTrv1("Known as the King of the Fruits");
                Guava.setTrv2("Banned in airplanes, hotels, and public places because of its pungent smell");
                dao.insert(Guava);
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
