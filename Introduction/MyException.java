public class MyException extends Exception {

    private Object data;

    // The class is not generic but the constructor and methods are. So, this wont be a problem.
    public <T> MyException(String message, T data) {
        super(message);
        this.data = data;
    }
    public <T> T getData() {
        return (T) data;
    }
}

class test {
    public static void main(String[] args) {
        try {
            throw new MyException("An error occured", 123);
        } catch (MyException e) {
            Integer data = e.getData();
            System.out.println("Exception data: " + data);
        }
    }
}

/***
 * Java does not allow the declaration of a generic class that extends Throwable.
 * This is because exceptions are used in a way that requires their type to be reifiable
 * (i.e., fully available at runtime). Generics, by contrast, use type erasure, which removes the type information at runtime.
 */