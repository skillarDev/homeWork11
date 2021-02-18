import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 11.1 массивы ссылочного типа
        Integer[] intArray = {1,2,3,4};
        String[] strArray = {"a","b","c","d","z"};
        // 11.1 вызов метода
        replace(intArray, 0, 2);
        replace(strArray, 1, 3);


        // 11.2 задаем массивы
        Integer[] intArray2 = {1,2,3,4};
        String[] strArray2 = {"a","b","c","d","z"};
        // 11.2 исходные типы заданных массивов
        System.out.println(intArray2.getClass());
        System.out.println(strArray2.getClass());
        // 11.2 преобразуем массивы в ArrayList
        convert(intArray2);
        convert(strArray2);


        // 11.3
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();

        Box<Apple> boxWithApple1= new Box<>();
        Box<Apple> boxWithApple2= new Box<>();
        Box<Orange> boxWithOrange1 = new Box<>();
        Box<Orange> boxWithOrange2 = new Box<>();

        boxWithApple1.add(apple1);
        boxWithApple1.add(apple2);
        boxWithApple1.add(apple3);
        boxWithOrange1.add(orange1);
        boxWithOrange1.add(orange2);
        boxWithOrange1.add(orange3);
        boxWithOrange2.add(orange4);

        System.out.println(boxWithApple1.toString());
        System.out.println(boxWithOrange1.toString());
        System.out.println(boxWithOrange2.toString());

        // 11.3.d Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        // вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        System.out.println(boxWithApple1.getWeight());
        System.out.println(boxWithOrange1.getWeight());

        // 11.3.e Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
        // true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
        System.out.println(boxWithApple1.compare(boxWithOrange1));

        // 11.3.f
        System.out.println(boxWithOrange1.transfer(boxWithOrange2));





    }

    // 11.1 Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static <Z> void replace(Z[] array, int indexSwap1, int indexSwap2){
        Z buf = array[indexSwap1];
        array[indexSwap1] = array[indexSwap2];
        array[indexSwap2] = buf;
        System.out.println(Arrays.toString(array));
    }

    // 11.2 Написать метод, который преобразует массив в ArrayList;
    public static <Z> void convert(Z[] array){
        List<Z> newArray = new ArrayList<>(Arrays.asList(array));
        System.out.println(newArray.getClass() + " " + newArray.toString());
    }

}
