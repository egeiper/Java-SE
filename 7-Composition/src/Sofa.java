public class Sofa {
    private SofaDimension sofaDimension;
    private String color;
    private int price;

    public Sofa(SofaDimension sofaDimension, String color, int price) {
        this.sofaDimension = sofaDimension;
        this.color = color;
        this.price = price;
    }
    public void closeoropenSofa(int open){

        if(open==0){
            System.out.println("Sofa is closed");
            open=1;
        }
        else {
            System.out.println("Sofa is opened");
            open=0;
        }

    }

    public SofaDimension getSofaDimension() {
        return sofaDimension;
    }

    public void setSofaDimension(SofaDimension sofaDimension) {
        this.sofaDimension = sofaDimension;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
