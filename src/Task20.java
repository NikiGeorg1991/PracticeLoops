public class Task20 {
    public static void main(String[] args) {
        int counter=0;
        for (int i = 0; i <= 9; i++) {
             counter = i;
            for (int x = 0; x <= 9; x++) {

                System.out.print(counter + " ");
                counter++;
                if(counter>=10){
                    counter=counter%10;
                }
            }
            System.out.println();
        }
    }
}
