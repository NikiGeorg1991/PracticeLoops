import java.util.Scanner;

public class RecursionLoops11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid: ");
        int height = scan.nextInt();
        char spaces = '2';
        char star = '*';
        int i = 0;
        pyramid(height,spaces,star,i);
    }
    public static void pyramid(int height,char spaces, char star, int i){
        if(i==height){
            return;
        }
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
        pyramid(height,spaces,star,i+1);
    }
}
