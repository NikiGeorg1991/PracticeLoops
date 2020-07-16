import java.util.Scanner;

public class RecursionLoops6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scan.nextInt();
//        System.out.println(sumFromOneToTheNumber(number, 0));
            sumFromOneToTheNumber(number,0);
    }

    public static void sumFromOneToTheNumber(int x, int sum) {
        if (x == 0) {
            System.out.println(sum);
            return ;
        }
        sum = sum + x;
        sumFromOneToTheNumber(x - 1, sum);
    }
}
