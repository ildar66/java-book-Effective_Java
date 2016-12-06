package chapter_3.item_7;

import java.awt.*;

/**
 * It turns out that this is a fundamental problem of equivalence relations in object-oriented languages.
 * There is simply no way to extend an instantiable class and add an aspect while preserving the equals contract.
 */
// Adds an aspect without violating the equals contract.
public class ColorPoint2 {

    private Point point;
    private Color color;

    public ColorPoint2(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = color;
    }

    /**
     * Returns the point-view of this color point.
     */
    public Point asPoint() {
        return point;
    }

    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint2))
            return false;
        ColorPoint2 cp = (ColorPoint2) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
    //... // Remainder omitted
}
