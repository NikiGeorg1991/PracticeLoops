import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a : ");
        int a = scan.nextInt();
        for ( int x = 3 ; x <= a*3 ; x+=3){
            System.out.print(x + " , ");
        }

    }
}
