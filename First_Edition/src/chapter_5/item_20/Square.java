package chapter_5.item_20;

/**
 * Created by User on 12.12.2016.
 */
class Square extends Rectangle {

    Square(double side) {
        super(side, side);
    }

    double side() {
        return length; // or equivalently, width
    }
}