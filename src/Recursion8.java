import java.util.Scanner;

public class Recursion8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int newNumber=0;
        int sum=0;
        System.out.println(sumOfDigits(start,newNumber,sum));
    }
    public static int sumOfDigits(int start, int newNumber, int sum){
        if(start==0){
            return sum;
        }
        newNumber = start%10;
        sum = sum + newNumber;
        return sumOfDigits(start/10,0,sum);
    }
}
