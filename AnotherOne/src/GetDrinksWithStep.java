public class GetDrinksWithStep {
    public static int getDrinksWithStep(int guestNumber, int step) {
        if (guestNumber <= 0 || step <= 0) {
            return 0;
        } 

        int totalDrinks = 0;
        if (step == 1) {
            for (int i = 1; i <= guestNumber; i++) {
                totalDrinks += i;
            }
            return totalDrinks;
        } else {
            for (int i = 1; i <= guestNumber; i++) {
                if (i % step == 1) {
                    totalDrinks += i;
                }
            }
            return totalDrinks;
        }
    }

    public static void main(String[] args) {
        System.out.println(getDrinksWithStep(10, 3)); // 1 + 4 + 7 + 10 = 22
        System.out.println(getDrinksWithStep(0, 5)); // 0 
        System.out.println(getDrinksWithStep(5, 3)); // 1 + 4 = 5
        System.out.println(getDrinksWithStep(18, 10)); // 1 + 11 = 12
        System.out.println(getDrinksWithStep(5, 1)); // 1+2+3+4+5 = 15
        System.out.println(getDrinksWithStep(10, 2)); // 1+3+5+7+9 = 25
    }
}
