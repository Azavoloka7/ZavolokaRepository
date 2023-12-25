package arrays.all;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Створення ArrayList<ArrayList<>>
        ArrayList<ArrayList<Integer>> twoDimensionalList = new ArrayList<>();

        // Створення першого списку та додавання елементів
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Створення другого списку та додавання елементів
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Додавання списків до двовимірного списку
        twoDimensionalList.add(list1);
        twoDimensionalList.add(list2);

        // Виведення елементів двовимірного списку
        for (ArrayList<Integer> list : twoDimensionalList) {
            for (Integer value : list) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
