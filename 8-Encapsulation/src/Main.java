public class Main {
    public static void main(String[] args) {
        /*Player player=new Player();
        player.name="Tim"; //changes in player class effects here.
        player.health=20;
        player.weapon="Sword";
        //because of public use, we can change the fields from main class

        int damage=10;
        player.loseHealth(damage);
        System.out.println("Remaining health= " +player.healthRemaining());

        damage=11;
        player.health=200;
        player.loseHealth(damage);
        System.out.println("Remaining health= " +player.healthRemaining());
        */

        EnchancedPlayer player=new EnchancedPlayer("Tim",150,"Sword");
        System.out.println( "Initial health is "+ player.getHealth() );

        //If we make health=200 it will display 100 because of encapsulation in enchancedpalyer class

    }


}
