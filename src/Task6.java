import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a : ");
        int a = scan.nextInt();
        int sum = 0;

        for (int x = 0; x <= a; x++) {
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
