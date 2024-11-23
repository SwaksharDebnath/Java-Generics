import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,3,3));

        System.out.println(sumOfArray(list));
        System.out.println(Operation.DIVIDE.apply(10, 20));
    }

    public static <T extends Number> Integer sumOfArray(List<T> t) {
        int sum = 0;

        for (T elements: t) {
            sum += elements.intValue();
        }
        return sum;
    }
}

enum Operation{
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T a, T b) {
        return switch (this) {
            case ADD -> a.doubleValue() + b.doubleValue();
            case SUBTRACT -> a.doubleValue() - b.doubleValue();
            case MULTIPLY -> a.doubleValue() * b.doubleValue();
            case DIVIDE -> a.doubleValue() / b.doubleValue();
            default -> throw new AssertionError("Unknown operation" + this);
        };
    }
}

