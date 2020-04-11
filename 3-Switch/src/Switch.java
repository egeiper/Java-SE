public class Switch {
    public static void main(String[] args) {
        /*int value = 1;
        if (value == 1)
            System.out.println("Value was 1");
        else if (value == 2)
            System.out.println("Value was 2");
        else
            System.out.println("Was not 1 or 2");
*/
        int switchvalue = 3;

        switch (switchvalue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
                default:
                    System.out.println("Was not 1 or 2");
                    break;
            case 3: case 4: case 5:
                System.out.println("Was not a 3 or 4 or 5");
                System.out.println("Actually it was "+switchvalue);
                break;
        }
        char charvalue='D';

        switch (charvalue){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;

                default:
                    System.out.println("Not Found");
                    break;
        }
    }
}
