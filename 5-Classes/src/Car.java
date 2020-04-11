public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel=model.toLowerCase();
        if(validModel.equals("carrera")||validModel.equals("holden")){
            this.model=model;//this points the model in the field inside Car class
        }
        else {
            this.model="Unknowm";
        }

    }
    public String getModel(){
        return this.model;
    }
}
