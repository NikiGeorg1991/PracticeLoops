import java.util.Scanner;

public class RecursionLoop14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter number: ");
            n = scan.nextInt();
        } while ((n < 10) || n > 200);
        int start=7;
        numbersFromNdevidedBy7(start,n);
    }
    public static void numbersFromNdevidedBy7(int start, int end){
        if(end<start){
            return;
        }
        if (end % 7 == 0) {
            System.out.println(end);
        }
        numbersFromNdevidedBy7(start,end-1);
    }
}
