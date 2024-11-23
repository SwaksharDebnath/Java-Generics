public class BoundedTypeParams {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(10);
        NumberBox<MyNumber> box = new NumberBox<>(myNumber);
        box.display();
    }
}

interface printable {
    void print();
}

class MyNumber extends Number implements printable {
    private final int value;

    MyNumber(int value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public void print() {
        System.out.println("MyNumber: " + value);
    }
}

class NumberBox<T extends Number & printable> {
    private final T value;

    public NumberBox(T value) {
        this.value = value;
    }
    public void display() {
        value.print();
    }
    public T getValue() {
        return value;
    }
}