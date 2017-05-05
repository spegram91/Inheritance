package pegram.stephen.Inheritance;

/**
 * Created by stephenpegram on 5/4/17.
 */
public class SuperHuman extends Human{

    String alignment, heroName, superAbility;

    public SuperHuman (String name, String heroName, String alignment, String superAbility, String gender, String occupation, String address, int age){
        super(name, gender, occupation, address, age);
        this.alignment = alignment;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }

    public String getAlignment(){
        return alignment;
    }

    public String getHeroName(){
        return heroName;
    }

    public String getSuperAbility(){
        return superAbility;
    }

    public void setAlignment(String alignment){
        this.alignment = alignment;
    }

    public void setHeroName(String heroName){
        this.heroName = heroName;
    }

    public void setSuperAbility(String superAbility){
        this.superAbility = superAbility;
    }

    @Override
    public String toString(){
        return "Name : "+super.getName()+"\nHero Alias : "+heroName+"\nGender : "+super.getGender()+"\nAge : "+super.getAge()+"\nHuman Occupation : "+super.getOccupation()+"\nAddress : "+super.getAddress();
    }

}
