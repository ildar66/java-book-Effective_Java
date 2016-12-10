package chapter_4.item_15;

public class Super {

    // Broken - constructor invokes overridable method
    public Super() {
        m();
    }

    public void m() {
    }
}
