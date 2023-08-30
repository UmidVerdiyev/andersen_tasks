package Tasks;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Array elements that are multiples of 3:");
        for (int num : numbers) {
            if (num % 3 == 0 && num != 0) {
                System.out.println(num);
            }
        }
    }
}
