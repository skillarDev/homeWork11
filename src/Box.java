import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box <T extends Fruit> {

    private List<T> newList = new ArrayList<>();

    Box(){
    }

    // добавялем фрукты в коробку
    public boolean add(T entry){
        newList.add(entry);
        return true;
    }

    // 11.3.d
    public <T extends Fruit> float getWeight() {
        if(this.newList.size() != 0){
            float getWeight = this.newList.get(0).getWeight() * this.newList.size();
            return getWeight;
        }
        return 0.0f;
    }

    // 11.3.e
    public boolean compare(Box<?> box){
        float weightThisBox = this.getWeight();
        float weightPutBox = box.getWeight();
        if(weightPutBox == weightThisBox) {
            return true;
        }
        return false;
    }

    // 11.3.f переносим объекты из вызываемой коробки в targetBox
    public String transfer(Box<T> targetBox){
        Iterator<T> iterator = this.newList.iterator();
        while(iterator.hasNext()){
            targetBox.newList.add(iterator.next());
            iterator.remove();
        }
        return "Старая коробка: " + this.newList.toString() + "\nНовая коробка: " + targetBox.newList.toString();
    }


    @Override
    public String toString() {
        return "Количество объектов в коробке" + " c " + this.newList.get(0).getClass().getName() + ": " + newList.size() + " шт.: "+ newList;

    }
}
