package r.tree;

public class RTreeNode {

    /*public RTreeNodeValue[] values;
    public RTreeNodeValue parent;*/

public Rectangle[] values;
public Rectangle parent;
public int level;

public RTreeNode(Rectangle parent) {
this.values = values;
this.parent = parent;
}

public RTreeNode(Rectangle[] values, int quantity) {
this.values = values;
}

public RTreeNode(int quantity) {
this.values = new Rectangle[quantity];
}
}