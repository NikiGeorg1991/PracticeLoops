public class TestTaskCoins {
    public static void main(String[] args) {

        int heads = 1;
        int toss = 2;
        int counter = 0;
        int current=0;
        int firstThrow;
        int correctThrows = 5;

        while (true) {
            counter++;
            firstThrow = (int) (Math.random()*2)+1;
            System.out.println("throw - " + counter + "  , firstThrow - " + firstThrow);
            if (firstThrow==heads){
                current++;
                if (current==correctThrows){
                    System.out.println("needed throws with math random - " + counter);
                    break;
                }
            }else {
                current=0;
            }
        }
    }
}
