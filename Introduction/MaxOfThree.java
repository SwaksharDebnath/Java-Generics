public class MaxOfThree {
    public static void main(String[] args) {
        System.out.println(maximum(1,2,3));
    }

    public static <T extends Number & Comparable<T>> T maximum(T a, T b, T c) {
        T max = a;
        if(b.compareTo(max) > 0) {
            max = b;
        }
        if(c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}


