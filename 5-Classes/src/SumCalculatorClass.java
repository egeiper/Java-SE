public class SumCalculatorClass {
    public static void main(String[] args) {
        SumCalculator calculator=new SumCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= "+calculator.getAdditionResult());
        System.out.println("sub= "+calculator.getSubractionResult());
        calculator.setFirstNumber(6);
        calculator.setSecondNumber(3);
        System.out.println("multiply= "+calculator.getMultiplicationResult());
        System.out.println("divide= "+calculator.getDivisionResult());

    }




}
