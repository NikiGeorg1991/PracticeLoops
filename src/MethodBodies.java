public class MethodBodies {
    public static void main(String[] args) {
        int[] arr = {1,3,6};
        incrementCells(arr);
        print(arr);
    }

    public static void incrementAndPrint(int[] masiv){
        incrementCells(masiv);
        print(masiv);
    }

    public static void incrementCells(int[] masiv){
        for (int i = 0; i < masiv.length; i++) {
            masiv[i]++;
        }
        print(masiv);
    }

    public static void print(int[] masiv){
        System.out.print("[");
        for (int i = 0; i < masiv.length; i++) {
            if(i == masiv.length-1){
                System.out.print(masiv[i]);
            }
            else{
                System.out.print(masiv[i] + ", ");
            }

        }
        System.out.println("]");
    }
}
