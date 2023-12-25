package generics;

public class Box<T> {
    private T value;

    public Box() {
        // Default constructor
    }

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // Create a Box of Integer
        Box<Integer> intBox = new Box<>(42);
        System.out.println("Integer Value: " + intBox.getValue());

        // Create a Box of String
        Box<String> strBox = new Box<>("Hello, Generics!");
        System.out.println("String Value: " + strBox.getValue());
        
        

        // No need for casting, and type safety is maintained
    }
}
