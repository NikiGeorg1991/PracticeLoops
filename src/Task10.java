import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scan.nextInt();
        boolean isItPrime = true;
        for (int i = 2; i < x; i++) {
            if(x % i == 0){
                isItPrime = false;
                break;
            }
        }
        if(isItPrime){
            System.out.println("Prosto e");
        }
        else{
            System.out.println("Ne e prosto");
        }

    }
}
