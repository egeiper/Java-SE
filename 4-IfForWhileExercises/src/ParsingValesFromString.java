public class ParsingValesFromString {
    public static void main(String[] args) {
        String numberasString="2018";
        System.out.println("numberasString "+numberasString);

        int number=Integer.parseInt(numberasString);
        System.out.println("number= "+number);

        numberasString=numberasString+1;
        number=number+1;
        System.out.println("numberasString "+numberasString);
        System.out.println("number= "+number);
    }
}
