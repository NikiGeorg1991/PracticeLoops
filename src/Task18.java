import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = scan.nextInt();
        System.out.println("Enter number m : ");
        int m = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                System.out.println( i  + "*" +  j  + "=" + ( i*j ));
            }
        }
    }
}
