import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = scan.nextInt();
        boolean vqrnolie = true;
        while (vqrnolie == true) {
            if (n == 1) {
                vqrnolie = false;
                System.out.print(n);
            } else {
                System.out.print(n + " , ");
            }
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }
    }
}

