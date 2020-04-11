public class Point {
    private int x;
    private int y;

    public Point(){

    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distancewithoutanyparameters(){
       double distance=Math.sqrt((x*x)+(y*y));
        return distance;
    }
    public double distancewithtwoparameters(int a,int b){
        return Math.sqrt((a-x)*(a-x)+(b-y)*(b-y));

    }
}
