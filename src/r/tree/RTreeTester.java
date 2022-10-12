package r.tree;

//import com.sun.source.tree.BinaryTree;
//import com.sun.source.tree.ExpressionTree;
//import com.sun.source.tree.TreeVisitor;

import java.util.ArrayList;
import java.util.List;

public class RTreeTester {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(1, 24, 3, 4);
        Rectangle rec2 = new Rectangle(7, 9, 29, 5);
        Rectangle rec3 = new Rectangle(9, 7, 15, 1);
        Rectangle rec4 = new Rectangle(22, 2, 3, 9);
        List recs = new ArrayList<Rectangle>();
        recs.add(rec1);
        recs.add(rec2);
        recs.add(rec3);
        recs.add(rec4);
        System.out.println("Before sort: " + recs);
        BubbleSort.sort(recs, RecMath.comparatorRec);
        System.out.println("After sort: " + recs);
    }
}
