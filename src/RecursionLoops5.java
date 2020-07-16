import java.util.Scanner;

public class RecursionLoops5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = scan.nextInt();
        System.out.println("Enter number2: ");
        int number2 = scan.nextInt();
        if (number1 == number2){
            System.out.println("Rawni sa");
        }
        if (number1 > number2) {
            numberFromLowerToBigger(number2, number1);
        }
        if (number1 < number2) {
            numberFromLowerToBigger(number1, number2);
        }
    }

    public static void numberFromLowerToBigger(int x, int j) {
        if (x>j){
            return;
        }
        System.out.println(x);
        numberFromLowerToBigger(x+1,j);
    }
}
