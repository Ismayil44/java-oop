import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Human{
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;


    public Human(){}


    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human(String name, String surname, int year, int iq,String[][] schedule,Family family){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;

    }



    public void setFamily(Family family){
        this.family = family;
    }

    public void greetPet(){
        System.out.println(name + " says: Hello, " + family.getPet().getNickname());
    }

    public void describePet(){
        System.out.println(name + " says: I have a " + family.getPet().getSpecies()+ " he is " + family.getPet().getAge() + " years old, he is " + (family.getPet().getTrickLevel()>=50 ? "very sly" : "almost not sly") );

    }


    public String SchedulePrint(){
        String s = "[";
        for(int i = 0 ; i<2;i++){
            for(int j = 0 ; j<2;j++){
                if(i==1 && j==1){
                    s+=schedule[i][j]+"]";
                }
                else {
                    s += schedule[i][j] + ", ";
                }
            }
        }
        return s;
    }

    public String toString(){
        return "Human { name=" + name + ", surname=" + surname + ", year=" + year + ", iq=" + (iq==0 ? "not given" : iq) +
                (schedule!=null ? ", schedule=" + Arrays.deepToString(schedule) +" }" : " }");
    }


    //Non-obligatory task
    public boolean feedPet(){
        System.out.println("Is it time for feeding(Enter true or false: ");
        boolean isTime= new Scanner(System.in).nextBoolean();
        if(isTime){
            System.out.println(name + " says: Hm... I will feed " + family.getPet().getNickname());
            return true;
        }
        else{
            Random random=new Random();
            int randomNum=random.nextInt(0,101);
            if(randomNum <= family.getPet().getTrickLevel()){
                System.out.println(name + " says: Hm... I will feed " + family.getPet().getNickname());
                return true;
            }
            else{
                System.out.println(name + "says: I think " + family.getPet().getNickname() + " is not hungry.");
                return false;
            }
        }
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Arrays.deepEquals(schedule, human.schedule);
    }

    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);
        result = 31 * result + Arrays.deepHashCode(schedule);
        return result;
    }
}