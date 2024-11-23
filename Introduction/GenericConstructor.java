public class GenericConstructor {
    public static void main(String[] args) {
        SomeBox someBox = new SomeBox(100);
    }
}

class SomeBox {
    private Integer value;
    public <T extends Number> SomeBox(T value) {
        this.value = value.intValue();
    }
}