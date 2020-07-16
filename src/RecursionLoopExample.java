import java.util.Scanner;

public class RecursionLoopExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean[] arr = {true,false,false,false,true,true,false};
        boolean isItTrue = true;
        int x;
        do {
            System.out.println("Enter positive number x: ");
            x=scan.nextInt();
        }while (x<1);
        if (x>arr.length){
            System.out.println("Masiva e s po-malyk broi elementi");
        }
        for (int i = 0; i <arr.length ; i++) {
            if((i<x)&&(arr[i]==isItTrue)){
                System.out.print("true se sreshta na poziciq : " + (i+1) + " , ");
            }
        }
    }
}
