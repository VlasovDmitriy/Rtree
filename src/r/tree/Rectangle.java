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
public double centre;

    public Rectangle(int xTop, int yTop, int xBottom, int yBottom) {
        this.xTop = xTop;
        this.yTop = yTop;
        this.xBottom = xBottom;
        this.yBottom = yBottom;
        centre = RecMath.findCentre(xBottom, xTop);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.centre, centre) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(centre);
    }

    //для тестов
    @Override
    public String toString() {
        return new String("" + centre);
    }
}
