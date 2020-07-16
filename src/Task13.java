import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scan.nextInt();
        for (int x = 10 ; x <= 999 ; x++){
            int a = x/100;
            int b = x % 100 / 10;
            int c = x % 10;
            if (a+b+c==number){
                System.out.println(x);
            }
        }
    }
}
