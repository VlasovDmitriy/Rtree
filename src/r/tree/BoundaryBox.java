package r.tree;

import java.util.ArrayList;
import java.util.List;

public class BoundaryBox implements BasicRectangle {
    private List<Rectangle> values;
    private double centre;
    public int maxEntries;
    private int entries = 0;
    private int xTop;
    private int yTop;
    private int xBottom;
    private int yBottom;

//    public BoundaryBox(int entries) {
//        this.entries = entries;
//    }

    public BoundaryBox(Rectangle value, int maxEntries) { //Создание объекта с указанием максимального количества записей и добавления записи
        this.maxEntries = maxEntries; //устанавливаем максимальное число записей
        values = new ArrayList<>(); //создаём массив величиной в максимальное количество записей
        values.add(value); //добавляем объект в записи и увеличиваем счётчик записей
        // устанавливаем размеры нового боунда по полученной записи
        this.xTop = value.xTop;
        this.yTop = value.yTop;
        this.xBottom = value.xBottom;
        this.yBottom = value.yBottom;
        this.centre = RecMath.findCentre(this.xTop, this.xBottom); //вычесляем центр
    }



    public BoundaryBox splitRoot(Rectangle rectangle){ //дробление объекта, возвращает новый объект с вложенным бОльшим прямоугольником
        if(RecMath.howMachDistance(this.centre, rectangle.centre, values.get(values.size()-1).centre)){
            return new BoundaryBox(rectangle, maxEntries);
        }
        else{
            values.add(rectangle);
            BubbleSort.sort(values, RecMath.comparatorRec);
            return new BoundaryBox(values.remove(values.size()-1), maxEntries);

        }
    }
//    public void expand(BoundaryBox boundaryBox, Rectangle rectangle){
//        if(boundaryBox.xTop < rectangle.xTop);
//    }
    public BoundaryBox insert(Rectangle value){
        if (this.values.size() < 3){ //если объект не заполнен
            values.add(value); //добавляем прямоугольник в объект
            this.xTop = this.xTop < value.xTop? value.xTop:this.xTop; //расширяем объект для покрытия нового прямоугольника
            this.yTop = this.yTop < value.yTop? value.yTop:this.yTop;
            this.xBottom = this.xBottom < value.xBottom? value.xBottom:this.xBottom;
            this.yBottom = this.yBottom < value.yBottom? value.yBottom:this.yBottom;
            if(!RecMath.howMachDistance(this.centre, value.centre, values.get(values.size() - 2).centre)){ // Если требуется сортировка
                BubbleSort.sort(values, RecMath.comparatorRec);
            }
            return null;
        }
        else { //объект заполнин, разделяем объект, возвращаем новый объект с самым дальним прямоуг.
            return splitRoot(value);
        }
    }
}