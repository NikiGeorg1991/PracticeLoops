import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a : ");
        int a = scan.nextInt();
        System.out.println(" Enter b : ");
        int b = scan.nextInt();
        int sum = 0;
        int max= 0;

        for (int x = a; x <= b; x++) {
            if(max>200 ){
                break;
            }
            int counter = x;
            sum = (counter * counter);
            if (sum % 3 == 0) {
                System.out.print("skip 3" + " , ");
            } else {
                System.out.print(sum + " , ");
                max=sum+sum;
            }

        }
    }
}
