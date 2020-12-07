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
                Durian.setTrv1("Known as the King of the Fruits.");
                Durian.setTrv2("Banned in airplanes, hotels, and public places because of its pungent smell.");
                dao.insert(Durian);

                fruit Mangosteen = new fruit();
                Mangosteen.setImage(R.drawable.mangosteen);
                Mangosteen.setName("Mangosteen");
                Mangosteen.setSciName("Garcinia mangostana");
                Mangosteen.setDesc("Mangosteen is an exotic tropical fruit with a slight sweetness and sourness combination. Has a purple color on its skin and a white fleshy flesh. This fruit usually comes from Southeast Asia and can be also found in other tropical regions around the world.");
                Mangosteen.setHb1("Good for Digestive Health");
                Mangosteen.setHb2("May promote weight loss");
                Mangosteen.setHb3("Good for Cardiovascular Health");
                Mangosteen.setHb4("Good for mental health");
                Mangosteen.setHb5("Helps maintain healthy skin");
                Mangosteen.setTrv1("Known as the Queen of the Fruits.");
                Mangosteen.setTrv2("Referred to as the purple mangosteen because of the deep purple color its rind develops when it ripes. This is in contrast to the bright white inner juicy flesh.");
                dao.insert(Mangosteen);

                fruit Mango = new fruit();
                Mango.setImage(R.drawable.mango);
                Mango.setName("Mango");
                Mango.setSciName("Mangifera indica");
                Mango.setDesc("Mango trees  are drupes that cary in size and shape with shades of red and yellow or dull green. The fruit can be oval, rount, heart-shaped, kidney-shaped, or long and slender. It has single flat, large seed with a surrounding fleshy layer.");
                Mango.setHb1("May support cardiovascular health");
                Mango.setHb2("May improve digestive health");
                Mango.setHb3("May support eye health");
                Mango.setHb4("May improve hair and skin health");
                Mango.setHb5("May help lower your risk of certain cancers");
                Mango.setTrv1("Mango tree is a flowering tree. The flowers of this tree are small and have 5 petals. The flowers are mostly white. However, don’t be surprised if you see pink flowers.");
                Mango.setTrv2("The color of a mango fruit is never an indicator of being ripe. Even a green mango can be ripe.");
                dao.insert(Mango);

                fruit DragonFruit = new fruit();
                DragonFruit.setImage(R.drawable.dragonfruit);
                DragonFruit.setName("Dragon Fruit");
                DragonFruit.setSciName("Hylocereus cactus");
                DragonFruit.setDesc("Also known as pitaya or the strawberry pear. The Dragon Fruit is a beautiful tropical fruit that tastes sweet and has a crunchy texture. Though it may look intimidating with its pinkish red skin and light green scales, preparing this unusual fruit is easy. You can enjoy eating it in fruit salads, it can be used to create tasty drinks and desserts, and it is a wonderful, healthy snack on its own.");
                DragonFruit.setHb1("Boosts Immune System");
                DragonFruit.setHb2("Stabilizes blood sugar");
                DragonFruit.setHb3("Helps Cardiovascular health");
                DragonFruit.setHb4("Boosts Iron Levels");
                DragonFruit.setHb5("Helps Skin Health");
                DragonFruit.setTrv1("The names “pitahaya” and “pitaya” come from Mexico, and “pitaya roja” in Central America and northern South America, possibly relating to pitahaya for names of tall cacti species with flowering fruit.");
                DragonFruit.setTrv2("Because dragon fruit blooms from evening to midnight, it’s sometimes called the “moonflower” or “Queen of the night.");
                dao.insert(DragonFruit);

                fruit Pomelo = new fruit();
                Pomelo.setImage(R.drawable.pomelo);
                Pomelo.setName("Pomelo");
                Pomelo.setSciName("Citrus maxima or Citrus grandis");
                Pomelo.setDesc("A large Asian citrus fruit that’s closely related to grapefruit. It’s shaped like a teardrop and has green or yellow flesh and a thick, pale rind. It can grow to the size of a cantaloupe or larger, and has a taste that is similar to grapefruit, but sweeter.");
                Pomelo.setHb1("Highly Nutriotious ");
                Pomelo.setHb2("Rich in Antioxidants");
                Pomelo.setHb3("May boost heart health");
                Pomelo.setHb4("May have anti-aging properties");
                Pomelo.setHb5("May help fight cancer cells");
                Pomelo.setTrv1("Pomelo leaves are used for aromatic baths. The essential oil can be extracted from the leaves, peel or seeds of some pomelo species.");
                Pomelo.setTrv2("The aromatic flowers are picked and processed into perfume in Vietnam, and the wood, which is heavy and hard-grained, used for making tool handles.");
                dao.insert(Pomelo);

                fruit Papaya = new fruit();
                Papaya.setImage(R.drawable.papaya);
                Papaya.setName("Papaya");
                Papaya.setSciName("Carica papaya");
                Papaya.setDesc("The papaya fruit is slightly sweet, with an agreeable musky tang, which is more pronounced in some varieties and in some climates than in others. It is a popular breakfast fruit in many countries and is also used in salads, pies, sherbets, juices, and confections. The unripe fruit can be cooked like squash.");
                Papaya.setHb1("Protects against skin damage");
                Papaya.setHb2("May improve digestion");
                Papaya.setHb3("May fight inflammation");
                Papaya.setHb4("May improve cardiovascular health");
                Papaya.setHb5("Has anticancer properties");
                Papaya.setTrv1("The Hawaiian varieties are the papayas commonly found in supermarkets. The flesh is bright orange or pinkish, depending on variety, with small black seeds clustered in the center.");
                Papaya.setTrv2("Gaining in popularity among tropical fruits worldwide, papaya is now ranked fourth in total tropical fruit production after bananas, oranges, and mango.");
                dao.insert(Papaya);

                fruit Guava = new fruit();
                Guava.setImage(R.drawable.guava);
                Guava.setName("Guava");
                Guava.setSciName("Psidium guajava");
                Guava.setDesc("Guavas are pear-shaped and their pulp contains many small hard seeds. It has a yellow skin and white, yellow, or pink flesh. Sometimes it has a pungent odour that is not always appreciated. ");
                Guava.setHb1("May help lower risk of cancer");
                Guava.setHb2("May help to constipated");
                Guava.setHb3("May improve eyesight");
                Guava.setHb4("May help relieve stress");
                Guava.setHb5("May help in weight loss");
                Guava.setTrv1("Guavas contain 4 times more fiber than a pineapple and 4 times more vitamin C than an orange.");
                Guava.setTrv2("The lifespan of a plant is 40 years.");
                dao.insert(Guava);

                fruit Jackfruit = new fruit();
                Jackfruit.setImage(R.drawable.jackfruit);
                Jackfruit.setName("Jackfruit");
                Jackfruit.setSciName("Artocarpus heterophyllus");
                Jackfruit.setDesc("Jackfruit has a mild-sweet flavour, it also has a pungent odour, which has been compared to that of limburger cheese; for this reason, the fruit is banned from public transportation in some places. The custard like pulp can be eaten at various stages of ripeness and is used in a variety of sweet and savory dishes. The seeds may also be eaten if roasted.");
                Jackfruit.setHb1("Helps anti-ulcer properties");
                Jackfruit.setHb2("It may help in blood sugar control");
                Jackfruit.setHb3("May help boost immune system");
                Jackfruit.setHb4("May help cardiovascular health");
                Jackfruit.setHb5("May help prevent skin problems");
                Jackfruit.setTrv1("In the Philippines, jackfruit is called “langka” in Filipino and “nangka” in Cebuano. The unripe fruit is usually cooked in coconut milk and is eaten together with rice.");
                Jackfruit.setTrv2("The jackfruit is a multiple fruit, made up of hundreds to thousands of individual flowers. The fleshly petals is really what’s eaten.");
                dao.insert(Jackfruit);

                fruit Rambutan = new fruit();
                Rambutan.setImage(R.drawable.rambutan);
                Rambutan.setName("Rambutan");
                Rambutan.setSciName("Nephelium lappaceum");
                Rambutan.setDesc("A small, round, and unusual looking tropical fruit native to Indonesia, Malaysia, and other Southeast Asian regions. The literal translation of ‘rambutan’ in Indonesia is ‘hair’, because of its skin full of small green spikes/ hairs that make the fruit look hairy. Once you peel the skin, the inside of the fruit is a smooth and moist white ball that covers a large seed.");
                Rambutan.setHb1("Boosts energy");
                Rambutan.setHb2("Improves digestive health");
                Rambutan.setHb3("Works as an aphrodisiac");
                Rambutan.setHb4("Promotes scalp and hair health");
                Rambutan.setHb5("Enhances skin health");
                Rambutan.setTrv1("Rambutan plant can reach as much as 66 feet in height.");
                Rambutan.setTrv2("Rambutan produces fruit twice a year. And each plant/tree can produce as many as 6,000 fruits per season.");
                dao.insert(Rambutan);
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
