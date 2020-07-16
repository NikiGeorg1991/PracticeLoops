public class RecursionLoops4 {
    public static void main(String[] args) {

        int start = 1;
        int end = 10;

        numbersFromTenToOne(start,end);
    }

    public static void numbersFromTenToOne(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.println(end);
        numbersFromTenToOne(start,end-1);
    }
}