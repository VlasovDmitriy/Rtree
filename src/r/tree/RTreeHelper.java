package r.tree;

import static java.lang.Math.abs;

public class RTreeHelper {
    private static int areaOfaRectangle(Rectangle rectangle){
        int areaOfaRectangle = abs(rectangle.xTop - rectangle.xBottom)*abs(rectangle.yTop - rectangle.yBottom);
        return areaOfaRectangle;
    }


    private static boolean isSecondRectangleInFirstRectangle(Rectangle rectangle1, Rectangle rectangle2){
        if(rectangle1.xTop < rectangle2.xTop &&
                rectangle2.yTop < rectangle1.yTop &&
                rectangle2.xBottom < rectangle1.xBottom &&
                rectangle2.yBottom < rectangle1.yBottom){
            return true;
        }
        return false;
    }
    private static boolean isItRectangle(Rectangle rectangle){
        if((rectangle.xTop != rectangle.xBottom) &&
                (rectangle.yTop != rectangle.yBottom)){
            if((rectangle.xTop < rectangle.xBottom) &&
                    (rectangle.yTop > rectangle.yBottom)){
                return  true;
            }
        }
        return false;
    }
    private static double[] findMiddleOfRectangle(Rectangle rectangle){
        double[] coordinates = new double[2];
        double middleX = (double) (rectangle.xBottom + rectangle.xTop) / 2;
        double middleY = (double) (rectangle.yBottom + rectangle.yTop) / 2;
        coordinates[0] = middleX;
        coordinates[1] = middleY;
        return coordinates;
    }
}
