public class Main {
    public static void main(String[] args) {
        //tried to use all constructors

        String[] habits = {"eat","drink","sleep"};
        Pet ExamplePet=new Pet("parrot","windy");
        Pet SecondChildPet=new Pet("dog","Rock",5,75,habits);


        Human FirstFamilyMother=new Human("Jane","Karleone",1958);
        Human FirstFamilyFather=new Human("Vito","Karleone",1955);

        Human FirstFamilyChild1=new Human("Michael","Karleone",1977,FirstFamilyMother,FirstFamilyFather);

        String[][] schedule = {{"5","7"},{"Resting","Hanging out"}};
        Human FirstFamilyChild2=new Human("Antonio","Karleone",1978,98,SecondChildPet,FirstFamilyMother,FirstFamilyFather,schedule);

        System.out.println("The family members\n" + FirstFamilyMother);
        System.out.println(FirstFamilyFather);
        System.out.println(FirstFamilyChild1);
        System.out.println(FirstFamilyChild2.toString());


        FirstFamilyChild2.greetPet();
        FirstFamilyChild2.describePet();

        SecondChildPet.eat();
        SecondChildPet.foul();
        SecondChildPet.respond();


        FirstFamilyChild2.feedPet();
    }
}
