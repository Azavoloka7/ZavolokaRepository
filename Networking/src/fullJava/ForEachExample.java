package fullJava;

public class ForEachExample {
    public static void main(String[] args) {
        // Масив цілих чисел
        int[] numbers = {1, 2, 3, 4, 5};

        // Виклик методу, який використовує цикл for-each
        printArrayElements(numbers);
    }

    // Метод для виведення елементів масиву за допомогою циклу for-each
    private static void printArrayElements(int[] arr) {
        System.out.println("Елементи масиву:");

        // Цикл for-each для перегляду елементів масиву
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println(); // Перехід на новий рядок після виведення елементів
    }
}
