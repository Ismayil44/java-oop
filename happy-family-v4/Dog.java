public class Dog extends Pet implements CanFoul{
    Dog(String nickname, int age, int trickLevel, String[] habits){
        super(Species.DOG,nickname,age,trickLevel,habits);
    }

    public void respond(){
        System.out.println(super.getNickname() + " barks: I am eating");
    }

    public void foul(){
        System.out.println(getNickname() + " says: I need to cover it up");
    }
}
