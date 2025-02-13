public class Main {
    public static void main(String[] args) {
        //tried to use all constructors

        String[] habits = {"eat","drink","sleep"};
        Pet ExamplePet=new Pet("parrot","windy");


        Human FirstFamilyMother=new Human("Jane","Karleone",1958);
        Human FirstFamilyFather=new Human("Vito","Karleone",1955);


        Family FirstFamily=new Family(FirstFamilyMother,FirstFamilyFather);

        Pet SecondChildPet=new Pet("dog","Rock",5,75,habits,FirstFamily);


        Human FirstFamilyChild1=new Human("Michael","Karleone",1977);

        String[][] schedule = {{"5","7"},{"Resting","Hanging out"}};
        Human FirstFamilyChild2=new Human("Antonio","Karleone",1978,98,schedule);
        FirstFamily.addChild(FirstFamilyChild2);
        FirstFamily.addChild(FirstFamilyChild1);
        FirstFamily.addPet(SecondChildPet);
        System.out.println(FirstFamily);
        FirstFamily.countOfFamilyMembers();
        FirstFamily.deleteChild(0);
        System.out.println(FirstFamily);
        FirstFamily.countOfFamilyMembers();

        //System.out.println("The family members\n" + FirstFamilyMother);
        //System.out.println(FirstFamilyFather);
        //System.out.println(FirstFamilyChild1);
        //System.out.println(FirstFamilyChild2.toString());


        //FirstFamilyChild2.greetPet();
        //FirstFamilyChild2.describePet();

        //SecondChildPet.eat();
        //SecondChildPet.foul();
        //SecondChildPet.respond();


        //FirstFamilyChild2.feedPet();
    }
}