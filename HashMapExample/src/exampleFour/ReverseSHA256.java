package exampleFour;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class ReverseSHA256 {

    private static Map<String, String> rainbowTable = new HashMap<>();

    static {
        // Populate the rainbow table with precomputed values (for educational purposes only)
        rainbowTable.put("23eedb14da403addd99d3c13b0b1960c60a885ed031c074b1b5f1f6d8de261fe", "password");
        // Add more entries as needed
    }

    public static String reverseSHA256(String hash) {
        // Look up the hash in the rainbow table
        return rainbowTable.get(hash);
    }

    public static String calculateSHA256(String input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(input.getBytes());

        // Convert byte array to a hexadecimal string
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String originalString = "password";
        String hash = calculateSHA256(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("SHA-256 Hash: " + hash);

        String reversedString = reverseSHA256(hash);
        System.out.println("Reversed String: " + reversedString);
    }
}
