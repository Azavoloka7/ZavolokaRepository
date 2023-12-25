package exampleFour;

public class ReverseFormatter {

    public static String reverseCommaSeparated(String formattedString) {
        String[] parts = formattedString.split(",");
        StringBuilder reversedString = new StringBuilder();

        for (int i = parts.length - 1; i >= 0; i--) {
            reversedString.append(parts[i].trim());
            if (i > 0) {
                reversedString.append(", ");
            }
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String formattedString = "Apple, Banana, Orange, Mango";
        String reversedString = reverseCommaSeparated(formattedString);

        System.out.println("Original String: " + formattedString);
        System.out.println("Reversed String: " + reversedString);
    }
}
