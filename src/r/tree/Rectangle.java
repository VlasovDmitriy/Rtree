package r.tree;


import static java.lang.Math.abs;

public class Rectangle {
public  int xTop;
public  int yTop;
public  int xBottom;
public  int yBottom;
//public Rectangle next;
public RTreeNode infant;

    public Rectangle(int xTop, int yTop, int xBottom, int yBottom) {
        this.xTop = xTop;
        this.yTop = yTop;
        this.xBottom = xBottom;
        this.yBottom = yBottom;
    }
}
