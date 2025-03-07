import java.security.spec.RSAOtherPrimeInfo;

public final class Man extends Human{
    Man(String name, String surname, int year){
        super(name,surname,year);
    }

    public void repairCar(){
        System.out.println(getName() + " repairs the car.");
    }

    public void greetPet(){
            System.out.println(getName() + " greets as a man: Hello, " + getFamily().getPet().getNickname());

    }
}
