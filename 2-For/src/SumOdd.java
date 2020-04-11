public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
    }
    public static boolean isOdd(int number){
        if(number>0){
            return (number%2!=0);
        }
        return false;
    }
    public static double sumOdd(int start,int end){
        int sum=0;
        for (int i=start;i<=end;i++){
            if(isOdd(i)) {
                sum = sum + i;
            }

        }
       if(end<start||end<1||start<1)
           return -1;
        return sum;
    }
}
