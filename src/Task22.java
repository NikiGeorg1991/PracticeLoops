import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number: ");
        int number = scan.nextInt();
        int counter = 0;

        while (counter < 10) {
            if ((number % 2 == 0) || (number % 3 == 0) || (number % 5 == 0)) {
                counter++;
                System.out.print(counter + ":" + number + " , ");
            }
            number++;
        }

    }
}
