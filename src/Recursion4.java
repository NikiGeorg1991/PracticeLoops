import java.util.Scanner;

public class Recursion4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = 1;
        System.out.print("enter end: ");
        int end = scan.nextInt();
        int sum = 0;
        System.out.print("Sum of natural numbers from 1 to " + startFrom1ToN(start,end,sum) +
                " with limit of sum under 100 : " + sumFrom1ToN(start,end,sum));
    }
    public static int startFrom1ToN(int start, int end, int sum){
        if((sum+(start+1)>100)||(start>end)){
            return start;
        }
        sum=sum+start;
        return startFrom1ToN(start+1,end,sum);
    }
    public static int sumFrom1ToN(int start, int end, int sum){
        if((sum+(start+1)>100)||(start>end)){
            return sum;
        }
        sum=sum+start;
        return sumFrom1ToN(start+1,end,sum);
    }
}
