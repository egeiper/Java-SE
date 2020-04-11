

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(11,21));
    }
    public static boolean hasSharedDigit(int number1,int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        int lsd1 = number1 % 10;
        int msd1 = (number1 / 10) % 10;
        int lsd2 = number2 % 10;
        int msd2 = (number2 / 10) % 10;
        if (lsd1 == lsd2 || lsd1 == msd2 || msd1 == lsd2 || msd1 == msd2) {
            return true;
        } else {
            return false;
        }
    }
}