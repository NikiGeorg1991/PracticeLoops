import java.util.Scanner;

public class Recursion6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int newNum = 0;

        System.out.println("reversNumber" + reversNumber(start, newNum));
    }

    public static int reversNumber(int start, int newNum) {
        if (start == 0) {
            return newNum;
        }
        newNum = newNum * 10 + start % 10;
        return reversNumber(start / 10, newNum);
    }
}
