public class Main {
    public static void main(String[] args) {
        //tried to use all constructors

        String[] habits = {"eat","drink","sleep"};
        Pet ExamplePet=new Pet(Species.PARROT,"windy");


        Human FirstFamilyMother=new Human("Jane","Karleone",1958);
        Human FirstFamilyFather=new Human("Vito","Karleone",1955);


        Family FirstFamily=new Family(FirstFamilyMother,FirstFamilyFather);

        Pet pet=new Pet(Species.DOG,"Rock",5,75,habits);


        Human FirstFamilyChild1=new Human("Michael","Karleone",1977);

        String[][] schedule = {{daysOfWeek.MONDAY.day,"resting"},{daysOfWeek.TUESDAY.day,"hiking"}};
        Human FirstFamilyChild2=new Human("Antonio","Karleone",1978,98,schedule,FirstFamily);


        FirstFamily.addChild(FirstFamilyChild2);
        FirstFamily.addChild(FirstFamilyChild1);
        FirstFamily.addPet(pet);
        System.out.println(FirstFamily);
        FirstFamily.countOfFamilyMembers();


        FirstFamily.deleteChildV2(FirstFamilyChild2);//FirstFamily.deleteChild(0);
        System.out.println(FirstFamily);
        FirstFamily.countOfFamilyMembers();


        //actions
        FirstFamilyChild2.feedPet();
        FirstFamilyChild2.greetPet();
        FirstFamilyChild2.describePet();
        pet.foul();
        pet.eat();
        pet.respond();



    }
}