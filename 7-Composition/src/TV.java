public class TV {
    private String brand;
    private int modelyear;
    private TVDimension tvDimension;
    private boolean isSmartTV;

    public TV(String brand, int modelyear, TVDimension tvDimension, boolean isSmartTV) {
        this.brand = brand;
        this.modelyear = modelyear;
        this.tvDimension = tvDimension;
        this.isSmartTV = isSmartTV;
    }
    public void TVPowerUp(){
        System.out.println("Power button pressed");
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModelyear() {
        return modelyear;
    }

    public void setModelyear(int modelyear) {
        this.modelyear = modelyear;
    }

    public TVDimension getTvDimension() {
        return tvDimension;
    }

    public void setTvDimension(TVDimension tvDimension) {
        this.tvDimension = tvDimension;
    }

    public boolean isSmartTV() {
        return isSmartTV;
    }

    public void setSmartTV(boolean smartTV) {
        isSmartTV = smartTV;
    }
}
