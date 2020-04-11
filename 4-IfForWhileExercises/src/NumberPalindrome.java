public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(-1221);
    }

    public static boolean isPalindrome(int number) {

        int reversedInt = 0;
        int remainder = 0;
        int originalInt;

        originalInt = number;

        while (number != 0) {
            remainder = number % 10;
            reversedInt = reversedInt * 10 + remainder;
            number /= 10;
        }
        if (originalInt == reversedInt) {
            System.out.println(originalInt + " is absolutely a palindrome");
            return true;
        }
        System.out.println(originalInt + " is definitely not a palindrome");
        System.out.println();
        return false;
    }
}