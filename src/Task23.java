public class Task23 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j >= i) {
                    System.out.print(i + "*" + j + "; ");
                }
            }
            System.out.println();
        }
//        int firstNum = 1;
//        int secNum = 1;
//        while (secNum <= 9) {
//            System.out.println(firstNum + "*" + secNum + "; ");
//            secNum++;
//
//        }

    }

}
