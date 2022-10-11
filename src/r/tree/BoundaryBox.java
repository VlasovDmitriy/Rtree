package r.tree;

public class BoundaryBox {
    public Rectangle value;
    public int maxEntries = 3;
    public int entries;
    public int xTop;
    public int yTop;
    public int xBottom;
    public int yBottom;



    public BoundaryBox(int entries) {
        this.entries = entries;
    }

    public BoundaryBox(Rectangle value, int maxEntries) {
        this.value = value;
        this.maxEntries = maxEntries;
        value
    }

    public void splitRoot(BoundaryBox boundaryBox){
    /* BoundaryBox boundaryBoxRoot = new BoundaryBox(1);  */

    }
    public void expand(BoundaryBox boundaryBox, Rectangle rectangle){
        if(boundaryBox.x < rectangle.)
    }
}
