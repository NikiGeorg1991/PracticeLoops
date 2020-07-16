public class Recursion5 {
    public static void main(String[] args) {

        int start=1;
        int end=100;
        int sum=0;
        System.out.println("Sum of even numbers between 1 to 100: " + sumOfEvenNumbersFrom1To100( start,  end,  sum));
        System.out.println("Sum of odd numbers between 1 to 100: " + sumOfOddNumbersFrom1To100( start,  end,  sum));
    }
    public static int sumOfEvenNumbersFrom1To100(int start, int end, int sum){
        if(start>end){
            return sum;
        }
        if(start%2==0){
            sum=sum+start;
        }
        return sumOfEvenNumbersFrom1To100(start+1,end,sum);
    }
    public static int sumOfOddNumbersFrom1To100(int start, int end, int sum){
        if(start>end){
            return sum;
        }
        if(start%2==1){
            sum=sum+start;
        }
        return sumOfOddNumbersFrom1To100(start+1,end,sum);
    }
}
