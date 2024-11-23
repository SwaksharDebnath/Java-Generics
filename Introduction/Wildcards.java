import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
//        list.add("sds"); cant do this. because wildcards can not guarantee type safety.

        printList(List.of("a", "b", "c"));
        printList(List.of(1,2,3));

        System.out.println(sum(List.of(1,2,3,4.5)));

        List<? super Integer> list1 = new ArrayList<>(List.of(10.5, 11.5, 12));
        addNumbers(list1);
        System.out.println(list1);
    }
    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    // Upper Bound Wildcards
    public static Double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // Lower Bound Wildcards
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        Object o = list.get(0); // have to use object, because does not know which super class.
    }

}

