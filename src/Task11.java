import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the height of triangle: ");
//        int height = scan.nextInt();
//        for (int row = 1; row <= height; row++){
//            for (int space = 0; space < height-row; space++) {
//                System.out.print(" ");
//            }
//            for (int star = 0; star < 2*row-1; star++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid: ");
        int height = scan.nextInt();
        char spaces = '2';
        char star = '*';

        for (int i = 0; i < height ; i++) {
            for (int k = 0; k < height - 1; k++) {
                if (k - i >= 0) {
                    System.out.print(spaces);
                }
            }
            for (int j = 0; j < 2 * height - 1; j++) {
                if (j < i * 2 +1) {
                    System.out.print(star);
                }
            }
            System.out.println();
        }
    }
}
