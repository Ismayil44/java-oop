public class Fish extends Pet{
    Fish(String nickname, int age, int trickLevel, String[] habits){
        super(Species.FISH,nickname,age,trickLevel,habits);
    }

    public void respond(){
        System.out.println(super.getNickname() + " gluk gluks: I am eating");
    }
}
