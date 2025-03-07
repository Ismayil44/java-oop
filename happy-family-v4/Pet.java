import java.util.Arrays;
import java.util.Objects;

public abstract class Pet{
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;


    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;

    }
    public Species getSpecies(){
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


    public Pet(String nickname){
        this.nickname = nickname;
    }
    public Pet(){}

    public void eat(){
        System.out.println(nickname + " says: I am eating");
    }
    public abstract void respond();



    public String toString(){
        return species.name + " { nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", canFly=" + species.canFly + ", number of legs=" + species.numOfLegs + ", hasFur=" + species.hasFur + ", habits= " + Arrays.toString(habits) + " }";
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) && Arrays.equals(habits, pet.habits);
    }


    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
    @SuppressWarnings("removal")
    protected void finalize() throws Throwable {
        System.out.println("Pet object is deleted.");
    }

}







