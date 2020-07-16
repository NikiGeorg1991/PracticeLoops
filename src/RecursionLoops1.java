public class RecursionLoops1 {
    public static void main(String[] args) {
        int start=1;
        int end = 100;
        numbersToOneHundred(start,end);
    }
    public static void numbersToOneHundred(int start , int end){
        if(start>end){
            return ;
        }
        System.out.println(start);
        numbersToOneHundred(start+1,end);
    }
}
