import java.util.Scanner;

public class RecursionLoops9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int numberA = scan.nextInt();
        System.out.println("Enter number b: ");
        int numberB = scan.nextInt();
        int sum=0;
        int max=0;
        numberFromTo(numberA,numberB,sum,max);
    }

    public static void numberFromTo(int start, int end, int sum, int max) {

        if (max > 200) {
            return;
        }
        int counter = start;
        sum = (counter * counter);
        if (sum % 3 == 0) {
            System.out.print("skip 3" + " , ");
        } else {
            System.out.print(sum + " , ");
            max = sum + sum;
        }
        numberFromTo(start+1,end,sum,max);

    }
}
