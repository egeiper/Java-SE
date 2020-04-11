public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(226));
    }
    public static double getEvenDigitSum (int number) {
        int lastdigit = 0;
        int firstdigit = 0;
        int sum = 0;
        if(number<=0)
            return -1;
        while (number > 0) {
            firstdigit = number % 10;
            if (firstdigit % 2 == 0) {
                sum = sum + firstdigit;
            }
            number = number / 10;

        }
        return sum;
    }
}
