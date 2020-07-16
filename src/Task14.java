import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter number: ");
            n = scan.nextInt();
        } while ((n < 10) || n > 200);

        for (int x = n; x >= 10; x--) {
            if (x % 7 == 0) {
                System.out.println(x);
            }
        }
    }
}
