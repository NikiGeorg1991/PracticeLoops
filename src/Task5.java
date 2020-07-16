import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a : ");
        int a = scan.nextInt();
        System.out.println(" Enter b : ");
        int b = scan.nextInt();

        if ( a > b){
            for (int x = b ; x<=a ; x++){
                System.out.print(x + " , ");
            }
        } else{
            for (int x = a ; x<=b ; x++){
                System.out.print(x + " , ");
            }
        }


    }
}
