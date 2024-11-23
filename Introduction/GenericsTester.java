import java.awt.Container;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericsTester {
    public static void main(String[] args) {
        Box<Integer, String> mixedBox = new Box<>(10, "Hello");
        System.out.println(mixedBox.getFirst() + " " + mixedBox.getSecond());

        Pair<Integer, String> pair = new Pair<>(12, "Hello 12");
        System.out.println(pair.getValue(12));

        CustomList<String> customList = new CustomList<>();
        customList.addItem("No More");
        customList.addItem("Hellos");

        System.out.println(customList.getItem(0));
        System.out.println("print some");

        StringContainer<List<Integer>> cont = new StringContainer<>();
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        cont.add(list);

        System.out.println(cont.get());

        // Will Give Warnings
        Box box = new Box<>(10, "Hello");
        mixedBox = box;

        NumberContainer<Integer> nCont = new NumberContainer<>();
        nCont.setValue(12);

    }
}


class Box<T, S> {
    private T t;
    private S s;
    public Box(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getFirst() { return t;}
    public S getSecond() { return s;}
}

class Pair<K, V> {
    private Map<K, V> map = new HashMap<>();
    public Pair(K key, V val) {
        map.put(key, val);
    }
    public V getValue(K key) {
        return map.get(key);
    }
}

class CustomList<E> {
    private List<E> list = new ArrayList<>();
    public void addItem(E e) {
        list.add(e);
    }
    public E getItem(int index) {
        return list.get(index);
    }
}

