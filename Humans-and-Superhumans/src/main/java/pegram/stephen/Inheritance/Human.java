package pegram.stephen.Inheritance;

/**
 * Created by stephenpegram on 5/4/17.
 */
public class Human {

  private String name, gender, occupation, address;
  private int age;


    public Human (String name, String gender, String occupation, String address, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.occupation = occupation;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public String getOccupation(){
        return occupation;
    }

    public String getAddress(){
        return address;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(String gender){
        this.gender =  gender;
    }

    public String setOccupation(String occupation){
        this.occupation = occupation;
    }

    public String setAddress(){
        this.address =  address;
    }

    public int setAge(int age){
        this.age =  age;
    }
}
