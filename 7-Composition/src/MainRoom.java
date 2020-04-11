public class MainRoom {
    public static void main(String[] args) {
        TVDimension tvDimension=new TVDimension(200,300,400);
        TV tv=new TV("Samsung",2019,tvDimension,true);
        SofaDimension sofaDimension=new SofaDimension(1500,200,300);
        Sofa sofa=new Sofa(sofaDimension,"red",2000);
        Room room=new Room(tv,sofa);
        tv.TVPowerUp();
        sofa.closeoropenSofa(1);
        room.getStatusofSofa();
    }
}
