package generics;

public class GenericClass<T> {

    private T genericField;

    public GenericClass(T genericField) {
        this.genericField = genericField;
    }

    public T getGenericField() {
        return genericField;
    }

    public void setGenericField(T genericField) {
        this.genericField = genericField;
    }

    public void printGenericInfo() {
        System.out.println("Type of genericField: " + genericField.getClass().getName());
        System.out.println("Value of genericField: " + genericField.toString());
    }

    public static <U> void genericMethod(U input) {
        System.out.println("Generic Method with input: " + input);
    }

    public static void main(String[] args) {
        // Використання generic class з Integer
        GenericClass<Integer> intGeneric = new GenericClass<>(42);
        intGeneric.printGenericInfo();

        // Використання generic class з String
        GenericClass<String> stringGeneric = new GenericClass<>("Hello, Generics!");
        stringGeneric.printGenericInfo();
        
        // Використання generic method
        GenericClass.genericMethod(3.14);
       
        
        
    }
}
