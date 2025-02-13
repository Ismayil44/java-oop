import java.util.Arrays;

public class Pet{
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    private Family family;


    public Pet(String species, String nickname, int age, int trickLevel, String[] habits,Family family){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
        this.family = family;

    }
    public String getSpecies(){
        return species;
    }
    public String getNickname(){
        return nickname;
    }
    public int getAge(){
        return age;
    }
    public int getTrickLevel(){
        return trickLevel;
    }
    public String[] getHabits(){
        return habits;
    }
    public void setFamily(Family family){
        this.family = family;
    }

    public Pet(String species,String nickname){
        this.species = species;
        this.nickname = nickname;
    }
    public Pet(){}

    public void eat(){
        System.out.println(nickname + " says: I am eating");
    }
    public void respond(){
        System.out.println(nickname + " says: Hello, owner. I am - " + nickname + " I miss you!");

    }
    public void foul(){
        System.out.println(nickname + " says: I need to cover it up");

    }


    public String toString(){
        return species + " { nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits= " + Arrays.toString(habits) + " }";
    }
}








