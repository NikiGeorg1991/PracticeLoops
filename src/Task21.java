import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number between 1 and 51: ");
        int number = scan.nextInt();
        int counter = 0;

        for (int card = number; card <= 52; card++) {
            int cardNumber = (card - 1) / 4 + 1;
            switch (cardNumber) {
                case 1:
                    System.out.print("Two of ");
                    break;
                case 2:
                    System.out.print("Three of ");
                    break;
                case 3:
                    System.out.print("Four of ");
                    break;
                case 4:
                    System.out.print("Five of ");
                    break;
                case 5:
                    System.out.print("Six of ");
                    break;
                case 6:
                    System.out.print("Seven of ");
                    break;
                case 7:
                    System.out.print("Eight of ");
                    break;
                case 8:
                    System.out.print("Nine of ");
                    break;
                case 9:
                    System.out.print("Ten of ");
                    break;
                case 10:
                    System.out.print("Jack of ");
                    break;
                case 11:
                    System.out.print("Queen of ");
                    break;
                case 12:
                    System.out.print("King of ");
                    break;
                case 13:
                    System.out.print("Ace of ");
                    break;
            }
            if (card % 4 == 1) {
                System.out.print("club");
            }
            if (card % 4 == 2) {
                System.out.print("diamond");
            }
            if (card % 4 == 3) {
                System.out.print("heart");
            }
            if (card % 4 == 0) {
                System.out.print("spade");
            }
            if (card < 52) {
                System.out.println(",");
            }
        }
    }
}


