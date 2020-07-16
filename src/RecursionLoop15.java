import java.util.Scanner;

public class RecursionLoop15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = 0;
        int end = scan.nextInt();
        int sum = 0;
        System.out.println(sumToNumberN(start, end, sum));

    }

    public static int sumToNumberN(int start, int end, int sum) {
        if (start > end) {
            return sum;
        }
        sum = sum + start;
        return sumToNumberN(start + 1, end, sum);
    }
}
