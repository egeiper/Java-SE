public class Room {
    private TV tv;
    private Sofa sofa;
    private SofaDimension sofaDimension;

    public Room(TV tv, Sofa sofa) {
        this.tv = tv;
        this.sofa = sofa;
    }
    public void turnonTV(){
        tv.TVPowerUp();
    }
    public void getStatusofSofa(){
        sofa.closeoropenSofa(1);
    }
}
