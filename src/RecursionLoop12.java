public class RecursionLoop12 {
    public static void main(String[] args) {
        int start = 100;
        int end = 999;

        showAllNumberWithDiffValues(start,end);
    }
    public static void showAllNumberWithDiffValues(int start, int end){
        if(start==end+1){
            return;
        }
        int a = start/100;
        int b = start % 100 / 10;
        int c = start % 10;
        if((a!=b)&&(a!=c)&&(b!=c)){
            System.out.println(start);
        }
        showAllNumberWithDiffValues(start+1,end);
    }
}
