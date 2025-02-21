public enum Species {
    DOG("Dog",false,4,true),
    CAT("Cat",false,4,true),
    PARROT("Parrot",true,2,true),
    TURTLE("Turtle",false,4,false),
    FISH("Fish",false,0,false),
    MOUSE("Mouse",false,4,true);


    public String name;
    public boolean canFly;
    public int numOfLegs;
    public boolean hasFur;

    Species(String name, boolean canFly, int numOfLegs,boolean hasFur) {
        this.name=name;
        this.canFly = canFly;
        this.numOfLegs = numOfLegs;
        this.hasFur = hasFur;
    }
}
