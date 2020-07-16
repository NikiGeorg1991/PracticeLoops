import java.util.Scanner;

public class Recursion7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int copyStart=start;
        int newNumber=0;
        boolean isItPalindrom = true;

        System.out.println(isPalindrom(start,copyStart,newNumber,isItPalindrom));
    }
    public static boolean isPalindrom(int start,int copyStart , int newNumber, boolean isItPalindrom){
        if (start==0){
            if(copyStart!=newNumber){
                isItPalindrom = false;
            }
            return isItPalindrom;
        }
        newNumber=newNumber*10+start%10;
        return isPalindrom(start/10,copyStart,newNumber,isItPalindrom);
    }
}
