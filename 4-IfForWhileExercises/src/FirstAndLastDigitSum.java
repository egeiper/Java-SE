public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstandLastDigit(425));
    }
    public static double sumFirstandLastDigit(int number){
       int sum=0;
       int firstdigit=0;
       int lastdigit=0;

        if(number<=0)
            return -1;
        lastdigit=number%10;
        while(number>0){

           firstdigit=number%10;
           number=number/10;





        }

sum=lastdigit+firstdigit;
        return sum;
    }
}
