import java.util.Scanner;

public class RecursionExample {
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
        int start=0;
        whichPostionsAreTrue(arr,start,x,isItTrue);
    }
    public static void whichPostionsAreTrue ( boolean[] masiv, int start, int end,boolean isItTrue){
        if(start>end){
            return;
        }
        if((start<end)&&(masiv[start]==isItTrue)){
            System.out.print("true se sreshta na poziciq : " + (start+1) + " , ");
        }
        whichPostionsAreTrue(masiv,start+1,end,isItTrue);
    }
}
