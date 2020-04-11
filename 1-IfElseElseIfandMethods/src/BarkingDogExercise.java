public class BarkingDogExercise {
    public static void main(String[] args) {
        System.out.println(Bark(true,1));
        System.out.println(Bark(false,2));
        System.out.println(Bark(true,8));
        System.out.println(Bark(true,-1));
    }
    public static boolean Bark(boolean barking, int hourOfDay){
        if (hourOfDay>=0 && hourOfDay<23){
        if (barking==true) {
            if (hourOfDay < 8)
                return true;
            else if (hourOfDay >= 8 && hourOfDay <= 22)
                return false;

            else
                return true;
        }
        }

            return false;
    }
}
