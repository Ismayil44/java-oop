public enum Species {
    DOG("Dog",false,4,true),
    DOMESTICCAT("Cat",false,4,true),
    FISH("Fish",false,0,false),
    ROBOCAT("Robotic Cat",false,4,false),
    UNKNOWN("Unknown",false,0,false);




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
