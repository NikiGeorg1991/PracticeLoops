public class Test5Task3 {
    public static void main(String[] args) {

        int[] arr = {-25, -14, -9, -1, 0, 2, 4, 12, 22, 31};
        int start = 0;
        sortedArray(arr,start);
    }

    public static void sortedArray(int[] masiv, int start) {
        for (int i = 0; i < masiv.length ; i++) {
            if (masiv[i]<0){
                start++;
            }
        }
        System.out.println(start);
    }
}
