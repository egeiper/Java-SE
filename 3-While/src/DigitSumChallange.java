public class DigitSumChallange {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }
    public static double sumDigits(int number){
        if(number<10){
            return -1;
        }

        int sum=0;
        while (number>0) {
            int digit = number%10;
            sum+=digit;
            number=number/10;

        }
        return sum;

    }
}
