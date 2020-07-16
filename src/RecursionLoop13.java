public class RecursionLoop13 {
    public static void main(String[] args) {
        int number = 26;
        int x=100;
        sumTwentySeven(x,number);
    }
    public static void sumTwentySeven(int x,int number){
        if(x>999){
            return;
        }
        int a = x/100;
        int b = x % 100 / 10;
        int c = x % 10;
        if (a+b+c==number){
            System.out.println(x);
        }
        sumTwentySeven(x+1,number);
    }
}
