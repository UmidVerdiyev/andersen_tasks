package Tasks;

import java.util.Scanner;

public class NameTask {
    public static void main(String[] args) {
        printName();
    }


    public static void printName() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String mainString = scr.nextLine();
        final String name = "John";

        int index = mainString.indexOf(name);

        if (index != -1) {
            int endIndex = index + name.length();
            String extractedSubstring = mainString.substring(index, endIndex);
            System.out.println("Hello, " + extractedSubstring);
        } else {
            System.out.println("There is no such name");
        }
    }
}
