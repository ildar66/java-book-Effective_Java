package chapter_5.item_20;

/**
 * Here is the class hierarchy corresponding to the discriminated union example:
 */
abstract class Shape {

    abstract double area();
}

class Circle extends Shape {

    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    final double length;
    final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}
