package r.tree;


import java.util.Objects;

import static java.lang.Math.abs;

public class Rectangle implements BasicRectangle{
public  int xTop;
public  int yTop;
public  int xBottom;
public  int yBottom;
//public Rectangle next;
public RTreeNode infant;
public double weight;

    public Rectangle(int xTop, int yTop, int xBottom, int yBottom) {
        this.xTop = xTop;
        this.yTop = yTop;
        this.xBottom = xBottom;
        this.yBottom = yBottom;
        weight = RecMath.centre(xBottom, xTop);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    //для тестов
    @Override
    public String toString() {
        return new String("" + weight);
    }
}
