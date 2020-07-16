public class Test5Task2 {
    public static void main(String[] args) {
        String text = "tEsTa pRi KrAsI sHte bYdE mNoY kOftI.";
        int lowerLetters = 0;
        int upperLetters = 0;
        int sumOfAllLetter = 0;
        sentence(text, lowerLetters, upperLetters, sumOfAllLetter);
    }

    public static void sentence(String text, int lowerLetter, int upperLetter, int sumOfAllLetter) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 'a' && text.charAt(i) < 'z') {
                lowerLetter++;
            }
            if (text.charAt(i) > 'A' && text.charAt(i) < 'Z') {
                upperLetter++;
            }
        }
        sumOfAllLetter=lowerLetter+upperLetter;
        System.out.println("отношението малки към големи букви е");
        int malkiKymGolemi = lowerLetter/4;
        int golemiKymMalki = upperLetter/4;
        System.out.println("малки - " + malkiKymGolemi  + " : " + golemiKymMalki + " - големи" );
    }
}
