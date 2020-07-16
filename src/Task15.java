import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scan.nextInt();
        int sum = 0 ;
        for (int x = 0 ; x<=n ; x++){
            sum = sum +x ;
        }
        System.out.println(sum);

    }
}
