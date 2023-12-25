package fullJava;

import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        // Using primitive data type
        int primitiveInt = 42;

        // Converting primitive to wrapper class object
        Integer wrappedInt = Integer.valueOf(primitiveInt);

        // Autoboxing (automatically converting primitive to wrapper)
        Integer autoboxedInt = primitiveInt;

        // Using wrapper class object
        System.out.println("Primitive Int: " + primitiveInt);
        System.out.println("Wrapped Int: " + wrappedInt);
        System.out.println("Autoboxed Int: " + autoboxedInt);

        // Converting wrapper class object to primitive
        int unwrappedInt = wrappedInt.intValue();

        // Unboxing (automatically converting wrapper to primitive)
        int unboxedInt = autoboxedInt;

        // Using primitive again
        System.out.println("Unwrapped Int: " + unwrappedInt);
        System.out.println("Unboxed Int: " + unboxedInt);
     

    }
}
