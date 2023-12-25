package fullJava;

public class PrintfExample {

    public static void main(String[] args) {
        String name = "Anatolii";
        int age = 25;
        double salary = 500000.75;
        boolean myBoolean = true;
        
        // Використання printf для форматованого виведення
        System.out.printf("Hello, %-10s! You are %d years old and your salary is %.2f%n %b ", name, age, salary, myBoolean);
        System.out.println();

        // Ще один приклад з використанням різних форматів
        int quantity = 3;
        double price = 19.99;

        System.out.printf("You bought %d items at $%.2f each. The total cost is $%.2f%n", quantity, price, quantity * price);
        
       long longValue = 12345673553589012L;
        double doubleValue = 1234.56789;

        System.out.printf("Formatted output: %,d %.2f%n", longValue, doubleValue); 
       
        
        float floatValue = 123.456f;
        double doubleValue1 = 1234.56789;

        System.out.printf("Formatted output: %.2f %f %n", floatValue, doubleValue1);
    }
}

/*
 В цьому прикладі ми використовуємо метод printf для форматованого виведення рядка. У рядку форматування %s вказує на те, що потрібно вставити рядковий аргумент, %d вказує на цілочисельний аргумент, а %.2f вказує на число з плаваючою точкою із двома знаками після коми.

Цей приклад дозволяє вам більш докладно контролювати виведення даних та їх формат.
 */