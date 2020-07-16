public class Test8Task1 {
    public static void main(String[] args) {
        int[] arr = {546,54,64,64,5,342,3};
        int sum = 0;
        System.out.println(findSumRecursive(arr,0,sum));
    }
    public static int findSumRecursive(int[] arr, int i, int sum){
        if(i == arr.length){
            return sum;
        }
        if(arr[i] % 3 == 0){
            sum += arr[i];
        }
        return findSumRecursive(arr, i+1, sum);
    }
}
