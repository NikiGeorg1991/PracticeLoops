import java.util.Scanner;

public class Recursion3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start=0;
        System.out.print("Enter target: ");
        int end =scan.nextInt();

        evenNumber(start,end);
        System.out.println();
        oddNumber(start,end);
    }
    public static void evenNumber(int start, int end){
        if(start>end){
            return;
        }
        if(start%2==0){
            System.out.print("even numbers : " + start + " , ");
        }
        evenNumber(start+1,end);
    }
    public static void oddNumber(int start, int end){
        if(start>end){
            return;
        }
        if(start%2==1){
            System.out.print("odd numbers : " + start + " , ");
        }
        oddNumber(start+1,end);
    }
}
