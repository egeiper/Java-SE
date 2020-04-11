public class ForLoop {
    public static void main(String[] args) {
        System.out.println(isPrime(14));
        for (int i = 0; i < 5; i++) {
            System.out.println("10.000 at %2 +interest = " + calculateInterest(10000, i));
        }

        int count = 0;
        for (int x = 20; x <= 38; x++) {
            if (isPrime(x) == true) {
                System.out.println(x + " is prime number");
                count++;
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;


                }
            }
        }
    }

    public static double calculateInterest(double amount, double InterestRate) {
        return (amount * (InterestRate / 100));
    }

    public static boolean isPrime(double number) {
        if (number == 1)
            return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;


        }
        return true;
    }



}
