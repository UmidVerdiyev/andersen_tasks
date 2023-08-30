package Tasks;

import java.util.Scanner;

public class NumberTask {
    public static void main(String[] args) {
        checkNum();
    }

    public static void checkNum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Add number: ");
        try {
            int number = sc.nextInt();
            sc.nextLine();
            if (number > 7) {
                System.out.println("Hello");
            } else if (number == 7) {
                System.out.println("Added number is equal to 7");
            } else {
                System.out.println("Added number is less than 7");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Type is not matching. Please enter a valid integer.");
        }
    }
}
