import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        for (int x = 100 ; x < 999 ; x++){
            int a = x/100;
            int b = x % 100 / 10;
            int c = x % 10;
            if((a!=b)&&(a!=c)&&(b!=c)){
                System.out.println(x);
            }
        }
    }
}
