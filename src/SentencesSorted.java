import java.util.Arrays;

public class SentencesSorted {
    public static void main(String[] args) {

        String sentence = "This test has some pretty fun tasks.";
        sentence = sentence.toLowerCase();
        String[] words = sentence.split("[ .!?]+");
        int[] compareInts = new int[words.length];
        String compareWith = "zzz";
        for (int i = 0; i < compareInts.length; i++) {
            compareInts[i]=compareWith.compareTo(words[i]);
        }
        
        for (int i = 0; i < words.length; i++) {
            boolean isSorted =true;
            for (int j = 0; j <words.length-i-1 ; j++) {
                if(compareInts[j]<compareInts[j+1]){
                    int temp = compareInts[j];
                    compareInts[j]=compareInts[j+1];
                    compareInts[j+1]=temp;
                    String tempWords = words[j];
                    words[j]=words[j+1];
                    words[j+1]=tempWords;
                    isSorted=false;
                }
            }
            if(isSorted){
                break;
            }
        }
        System.out.println(Arrays.toString(compareInts));
        System.out.println(Arrays.toString(words));
    }
}
