import java.util.Scanner;

public class RecursionLoops7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many number to be printed: ");
        int howManynNumberToPrint = scan.nextInt();
        int start=3;
        int counter=0;
        printFirstNumberNs(start,howManynNumberToPrint,counter);

    }
    public static int printFirstNumberNs(int start, int end,int counter){
        if(counter==end){
            return start;
        }
        if (start%3==0){
            System.out.println(start);
            counter++;
        }
        return printFirstNumberNs(start+1,end,counter);
    }
}
