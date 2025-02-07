import java.util.Random;
import java.util.Scanner;

public class Human{
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;


    public Human(){}


    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human(String name, String surname, int year, Human mother, Human father){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }


    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;

    }



    public void greetPet(){
    System.out.println(name + " says: Hello, " + pet.nickname);
    }

    public void describePet(){
        System.out.println(name + " says: I have a " + pet.species + " he is " + pet.age + " years old, he is " + (pet.trickLevel>=50 ? "very sly" : "almost not sly") );

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
        return "Human { name=" + name + ", surname=" + surname + ", year=" + year + ", iq=" + (iq==0 ? iq : "not given") +
                ", mother=" + (mother != null ? mother.name + " " + mother.surname : "dead") +
                ", father=" + (father != null ? father.name + " " + father.surname : "dead") +
                ", pet=" + (pet != null ? pet.toString() : "no pet") + (schedule!=null ? " schedule=" + SchedulePrint() +" }" : " }");
    }


    //Non-obligatory task
    public boolean feedPet(){
        boolean isTime= new Scanner(System.in).nextBoolean();
        if(isTime){
            System.out.println(name + " says: Hm... I will feed " + pet.nickname);
            return true;
        }
        else{
            Random random=new Random();
            int randomNum=random.nextInt(0,101);
            if(randomNum <= pet.trickLevel){
                System.out.println(name + " says: Hm... I will feed " + pet.nickname);
                return true;
            }
            else{
                System.out.println(name + "says: I think " + pet.nickname + " is not hungry.");
                return false;
            }
        }
    }
}
