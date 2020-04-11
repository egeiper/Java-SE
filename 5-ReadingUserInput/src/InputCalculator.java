import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){

        int counter=0;
        int sum=0;
        long average=0;
        boolean first=true;
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Enter number :");
            boolean isAnInt = sc.hasNextInt();
            if(isAnInt){
                int number=sc.nextInt();
                if(first){
                    counter++;
                    sum=sum+number;
                    average=sum/counter;

                }
            }
            else{
                break;
            }

        }
sc.nextLine();
        System.out.println("Sum: "+sum+" "+"Average: "+average);
        sc.close();
    }
}
