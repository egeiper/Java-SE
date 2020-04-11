public class WhileLoop {
    public static void main(String[] args) {
        /*int count=1;
        while(count!=6) {
            System.out.println("Count value is" + count);
        }
        count=1;
        /*while(true){
            if(count==6){
                break;
            }
            System.out.println("Count value is"+count);
            count++;
        }
*/  int number=4;
int finishNumber=20;
int count=0;
while(number<=finishNumber){

    number++;
    if(!isEvenNumber(number)){
        continue;

    }

    System.out.println("Even number "+ number);
    count++;
    if(count==5)
        break;

}
        System.out.println("Total number of even numbers "+count);
    }
    public static boolean isEvenNumber(int number){
        if(number%2!=0)
            return false;
        return true;



    }
}
