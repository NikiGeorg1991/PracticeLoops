import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter plindrom number: ");

        // тази задача не мога да я направя с do while, с while се получава, но при do не мога да разбера защо не иска да работи.

//        int palindrom;
//        int lastToFirst = 0;
//
//        do {
//            palindrom = scan.nextInt();
//            int number=palindrom;
//            int counter = number % 10;
//            lastToFirst = lastToFirst * 10 + counter;
//            number = number / 10;
//        } while ((palindrom < 30 || palindrom > 30_000) && (palindrom != 0));
//
//        if (palindrom == lastToFirst) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("NOT a Palindrome");
//        }

        int palindrom = scan.nextInt();
        int number = palindrom;
        int lastToFirst = 0;

        while (number != 0) {
            int counter = number % 10;
            lastToFirst = lastToFirst * 10 + counter;
            number = number / 10;
        }
        if (palindrom == lastToFirst) {

            System.out.println("Palindrome");
        } else {
            System.out.println("NOT a Palindrome");
        }
    }
}

