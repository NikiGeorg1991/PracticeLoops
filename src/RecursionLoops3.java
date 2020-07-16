public class RecursionLoops3 {
    public static void main(String[] args) {

        int start = -10;
        int end = 10;
        oddNumbersFromMinus10To10(start,end);
    }

    public static void oddNumbersFromMinus10To10(int start, int end) {
        if(start>end){
            return;
        }
        if ((start % 2 == 1)||(start % 2 == -1)) {
            System.out.println(start);
        }
        oddNumbersFromMinus10To10(start+1,end);
    }
}
