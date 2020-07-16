import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = scan.nextInt();
        int sum = 1;
        int counter = 1;
        do {
            sum = sum * counter;
            counter++;
        }
        while (counter <= n);
        System.out.println(sum);
    }
}
