import afterRefactoring.Product;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {



        Product product = new Product("Laptop", 1200.0, 7);
        Product product1 = new Product( "Laptop", 1200.0, 5 );
        System.out.println(product1.equals( product ));
        double total = product.calculateTotal();
        System.out.println(product.toString());

        System.out.println(product.hashCode());
        System.out.println(product1.hashCode());


   //     System.out.println("Сума: " + calculator.add());
    //    System.out.println("Різниця: " + calculator.subtract())
    //    System.out.println("Добуток: " + calculator.multiply());
    //    System.out.println("Ділення: " + calculator.divide());
    }
}
