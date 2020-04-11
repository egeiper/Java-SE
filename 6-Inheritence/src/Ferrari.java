public class Ferrari extends Car {
    private int roadServiceMonths;

    public Ferrari(int roadServiceMonths) {
        super("Ferrari", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelarate(int rate){
        int newVelocity=getCurrentVelocity()+rate;
        if(newVelocity==0){
            stop();
            changeGear(1);

        }
        else if(newVelocity>0&& newVelocity<=10){
            changeGear(1);
        }
        else if(newVelocity>10 && newVelocity<=20){
            changeGear(2);
        }
        if(newVelocity>0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
