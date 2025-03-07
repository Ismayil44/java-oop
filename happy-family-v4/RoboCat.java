public class RoboCat extends Pet {
    RoboCat( String nickname, int age, int trickLevel, String[] habits){
        super(Species.ROBOCAT,nickname,age,trickLevel,habits);

    }

    public void respond(){
        System.out.println(super.getNickname() + " notifies: I am eating");
    }

}
