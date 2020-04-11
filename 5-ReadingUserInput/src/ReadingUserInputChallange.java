import java.util.Scanner;

public class ReadingUserInputChallange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while (true) {

            System.out.println("Enter number " + counter + ":");
            boolean isAnInt = sc.hasNextInt();

            if (isAnInt) {
                int number = sc.nextInt();
                counter++;
                sum=sum+number;
                if(counter==10){
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }

        }

        System.out.println("sum: "+sum);
        sc.close();
    }
}
