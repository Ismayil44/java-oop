public class Cat extends Animal {

    public void makeSound() {
        System.out.println("Meow");
    }

    // Concrete method specific to Cat
    public void scream() {
        System.out.println("The cat is screaming.");
    }
}
