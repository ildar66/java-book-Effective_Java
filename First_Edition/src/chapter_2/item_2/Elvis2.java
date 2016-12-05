package chapter_2.item_2;

// Singleton with static factory
public class Elvis2 {

    private static final Elvis2 INSTANCE = new Elvis2();

    private Elvis2() {
        //...
    }

    public static Elvis2 getInstance() {
        return INSTANCE;
    }
    //... // Remainder omitted
}
