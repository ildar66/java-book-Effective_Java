package chapter_2.item_2;

// Singleton with final field
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
        //...
    }
    //... // Remainder omitted
}
