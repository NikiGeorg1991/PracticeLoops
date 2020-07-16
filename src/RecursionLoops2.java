public class RecursionLoops2 {
    public static void main(String[] args) {
        int start=-20;
        int end=50;
        numberFromMinusTwentyToFifty(start,end);

    }
    public static void numberFromMinusTwentyToFifty(int start, int end){
        if (start>end){
            return;
        }
        System.out.println(start);
        numberFromMinusTwentyToFifty(start+1,end);
    }
}
