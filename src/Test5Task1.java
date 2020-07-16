public class Test5Task1 {
    public static void main(String[] args) {

        int countToSeven = 0;
        int counterTotal = 0;
        int sum = 7;

        while (true) {
            int firstDice = (int) ((Math.random()) * 6) + 1;
            int secondDice = (int) ((Math.random()) * 6) + 1;
            counterTotal++;
            System.out.println("хвърляне - " + counterTotal +
                    "  , first dice = " + firstDice +
                    "  , second dice = " + secondDice);
            if (firstDice + secondDice == 7) {
                countToSeven++;
                if (countToSeven == sum) {
                    System.out.println(counterTotal);
                    break;
                }
            } else {
                countToSeven = 0;
            }
        }
    }
}
