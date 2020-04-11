import java.util.Scanner;

public class MinimumAndMaximumChallange {
    public static void main(String[] args) {

        int maxnumber=0;
        int minnumber=0;
        boolean first=true;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number "  + ":");
            boolean isAnInt = sc.hasNextInt();
            if (isAnInt) {
                int number = sc.nextInt();
                if(first) {
                    first = false;
                    minnumber = number;
                    maxnumber = number;
                }

                if(number>maxnumber){
                    maxnumber=number;
                }
                if(number<minnumber) {
                    minnumber = number;
                }

            }
            else{
                break;}
            }
                sc.nextLine();
        System.out.println("Min number: "+minnumber+" Max number: "+maxnumber);
        sc.close();
        }
        ;
    }
