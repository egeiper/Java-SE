public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(36));
    }
    public static double getLargestPrime(int number){
       int largestprime=0;
        if(number<0)
            return -1;
        for(int i=2;i<number;i++)
            if(number%i==0)
                largestprime=i;
            return largestprime;
    }

}
