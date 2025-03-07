public final class Woman extends Human{
    Woman(String name, String surname, int year){
        super(name,surname,year);
    }


    public void makeup(){
        System.out.println(getName() + " changed her face");
    }

    public void greetPet(){
            System.out.println(getName() + " greets as a woman: Hello, " + getFamily().getPet().getNickname());

    }
}
