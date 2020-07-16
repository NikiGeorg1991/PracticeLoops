import java.util.Scanner;

public class RecursionLoop16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter number: ");
            n = scan.nextInt();
        } while ((n < 10) || n > 5555);
        int start=49;
        numbersFromNdevidedByFifty(start,n);
    }
    public static void numbersFromNdevidedByFifty(int start, int end){
        if(end<start){
            return;
        }
        if (end%50==0){
            System.out.println(end);
        }
        numbersFromNdevidedByFifty(start, end-1);
    }
}
