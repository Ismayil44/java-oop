public class Pet{
    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String[] habits;


    public Pet(String species, String nickname, int age, int trickLevel, String[] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
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
        return species + " { nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=[" +
                String.join(", ", habits) + "] }";
    }
}









