import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = scan.nextInt();
        System.out.println("Enter number m : ");
        int m = scan.nextInt();

        if ((n==m)&&(n%50==0)){
            System.out.println(n);
        }
        if (n > m) {
            for (int x = n; x >= m; x--) {
                if (x % 50 == 0) {
                    System.out.println(x);
                }
            }
        } else {
            for (int x = m; x >= n; x--) {
                if (x % 50 == 0) {
                    System.out.println(x);
                }
            }
        }
    }
}
