public class Circle {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        if(radius<0){
            setRadius(0);
        }
    }
    public double getArea(){
        double area=(radius*radius*Math.PI);
        return area;
    }

}

