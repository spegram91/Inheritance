package pegram.stephen.Inheritance;

/**
 * Created by stephenpegram on 5/4/17.
 */
public class Main {
    public static void main (String[] args){

        SuperHuman clark = new SuperHuman("Clark Kent", "Superman", "Good", "Super Strength", "Male", "Journalist", "12345 I don't know", 30);

        System.out.println(clark.toString());


        clark.setHeroName("Bizarro");
        clark.setSuperAbility("Laser Vision");
        clark.setAlignment("Bad");
        clark.setOccupation("Evil Doer");

        System.out.println("\n"+clark.toString());
    }
}
