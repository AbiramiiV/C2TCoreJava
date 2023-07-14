package day2;

public class If {
    public static void main(String[] args) {
        int[] numbers = {7, 12, 18, 25, 30};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }
    }
}
