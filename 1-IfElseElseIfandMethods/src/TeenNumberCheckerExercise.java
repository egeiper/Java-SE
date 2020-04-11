public class TeenNumberCheckerExercise {
    public static void main(String[] args) {
        System.out.println(TeenNumberChecker(9,99,19));
        System.out.println(TeenNumberChecker(23,15,42));
        System.out.println(TeenNumberChecker(22,23,24));
    }
    public static boolean TeenNumberChecker(int number1,int number2,int number3){
        if(number1>=13 && number1<=19 || number2>=13 && number2<=19 ||number3>=13 && number3<=19)
            return true;

        return false;
    }
}
