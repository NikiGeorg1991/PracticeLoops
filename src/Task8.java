import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a : ");
        int a = scan.nextInt();

        int n1 = (3 * a - 3);
        int n2 = (3 * a - 3);
        if (a == 1) {
            System.out.println(0);
        } else {
            if (a % 2 == 0) {
                for (int row = a - 1; row <= n1; row++) {
                    for (int col = 1; col <= a; col++) {
                        if (row % 2 == 1)
                            System.out.print(row);
                    }
                    System.out.println();
                }
            } else {
                if (a % 2 == 1) {
                    for (int row = a - 1; row <= n2; row++) {
                        for (int col = 1; col <= a; col++) {
                            if (row % 2 == 0)
                                System.out.print(row);
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
