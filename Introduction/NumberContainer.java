public class NumberContainer<N extends Number> {
    private N value;

    public void setValue(N value) {
        this.value = value;
    }

    public N getValue() {
        return value;
    }

    // used N as a type parameter because of Number.
}
