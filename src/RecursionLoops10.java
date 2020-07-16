import java.util.Scanner;

public class RecursionLoops10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number and check is it prime");
        int numberToCheck = scan.nextInt();
        int start=2;
        boolean isItPrime = true;
        System.out.println(isPrime(numberToCheck,start,isItPrime));
    }
    public static boolean isPrime(int x,int start, boolean isItPrime){
        if (start>x/2){
            return isItPrime;
        }
        if(x % start == 0){
            isItPrime = false;
            return isItPrime;
        }
        return isPrime(x, start+1,isItPrime);
    }
}
