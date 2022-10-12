package r.tree;

public class RTree {

    public RTreeNode root = null;
    public int height;
    public int quantity;

    public void RTree(int quantity) {
        this.quantity = quantity;
    }


    public void addFirst(Rectangle rect) {
        this.root = new RTreeNode(rect);
    }


    public RTree(int quantity) {
        this.quantity = quantity;
        this.root = new RTreeNode(quantity);
        height = 1;
    }

    public void addRectangle(Rectangle rect) {
        if (height == 1) {
            if (root.values[quantity - 1] == null) {
                for (int i = 0; i < quantity; i++) {
                    if (root.values[i] == null) {
                        root.values[i] = rect;
                        break;
                    }
                }
            } else {
                splitRoot();
                addRectangle(rect);
            }
        } else {
            RTreeNode target = findNodeWithEmptySlot(root);
        }
    }

    private RTreeNode findNodeWithEmptySlot(RTreeNode node) {
        for (int i = 0; i < quantity; i++) {
            if (node.values[i].infant != null) {
                findNodeWithEmptySlot(node.values[i].infant);
            } else {
                for (int j = 0; j < quantity; j++) {
                    if (node.values[j] == null) {
                        return node;
                    }
                }
            }
        }
        return node;
    }

    private void splitRoot() {

    }
}