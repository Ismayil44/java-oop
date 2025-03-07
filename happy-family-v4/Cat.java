public class Cat extends Pet implements CanFoul{
    Cat( String nickname, int age, int trickLevel, String[] habits){
        super(Species.DOMESTICCAT,nickname,age,trickLevel,habits);
    }

    public void respond(){
        System.out.println(super.getNickname() + " meows: I am eating");
    }

    public void foul(){
        System.out.println(getNickname() + " says: I need to cover it up");

    }
}
