import java.util.Arrays;

public class Recursion11 {
    public static void main(String[] args) {
        int arrSize = 10;
        int start = 0;
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
        arrayElements(arr,start,arrSize);
    }
    public static void arrayElements(int[] arr,int start,int arrSize){
        if(start==arrSize){
            return;
        }
        System.out.print(arr[start] + " , ");
        arrayElements(arr,start+1,arrSize);
    }
}
