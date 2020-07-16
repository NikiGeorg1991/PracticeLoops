import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int b;
        char c;

        do{
            b = sc.nextInt();
        } while (b < 3 || b > 20);

        c = sc.next().charAt(0);

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == b - 1 || j == 0 || j ==  b - 1){
                    System.out.print("*");
                    continue;
                }
                System.out.print(c);
            }
            System.out.println();
        }
    }
}