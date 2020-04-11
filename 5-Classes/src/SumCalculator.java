public class SumCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    public double getFirstNumber(){
        return this.firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public  double getAdditionResult(){
        double sum=firstNumber+secondNumber;

        return sum;
    }
    public double getSubractionResult(){
        double sub=secondNumber-firstNumber;

        return sub;
    }
    public double getMultiplicationResult(){
        double mult=firstNumber*secondNumber;

        return mult;
    }
    public double getDivisionResult() {
        if (secondNumber != 0) {
            double div = firstNumber / secondNumber;

            return div;
        }
        else{
            return 0;
        }
    }
}
