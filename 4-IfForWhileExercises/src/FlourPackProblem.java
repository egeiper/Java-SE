public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));

    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int bigWeight=bigCount*5;
        int smallWeight=smallCount*1;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if (bigWeight + smallWeight < goal) {
            return false;
        } else if (bigWeight + smallWeight == goal) {
            return true;
        } else if (bigWeight < goal && (bigWeight + smallWeight) % goal >= 1) {
            return true;
        } else if (bigWeight > goal && (bigWeight % goal == 0 )){
            return true;
        } else if (bigWeight > goal && (bigWeight - 5) + smallWeight >= goal){
            return true;
        } else {
            return false;
        }
    }



    }

