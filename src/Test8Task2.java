public class Test8Task2 {

    public static void main(String[] args) {
        int counter=0;
        String s1 = "This lesson me makes me puke";
        String s2 = "This course me makes me kill myself";
        String s3 = "This book me makes me wanna burn it";
        String longestWord = getLongest(s1, s2, s3);
        System.out.println(longestWord);
    }

    public static String getLongest(String s1, String s2, String s3){
        String longestWord="";
        String[] wordsContainsS1 = s1.split(" ");
        for (int i = 0; i < wordsContainsS1.length; i++) {
            String word = wordsContainsS1[i];
            if(s2.contains(word)&&s3.contains(word)){
                if(word.length()>longestWord.length()){
                    longestWord=word;
                }
            }
        }
        return longestWord;
    }
}

