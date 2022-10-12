package r.tree;

import java.util.Comparator;

//класс для вычислений
public class RecMath {
    public static boolean howMachDistance(double box, double rec1, double rec2){ //Первый объект дальше второго от коробки?
        return Math.abs(box - rec1) > Math.abs(box - rec2);
    }
    public static double centre(int xTop, int xBottom){ //вычисление центра объекта (при условии, что задаваемый точки не равны не по одной координате)
        return (xBottom + xTop) / 2.0;
    }
    static Comparator<Rectangle> comparatorRec = Comparator.comparing(obj -> obj.weight);
}
