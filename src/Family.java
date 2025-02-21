import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;


    public Family(Human mother,Human father) {
        this.mother = mother;
        mother.setFamily(this);
        this.father = father;
        father.setFamily(this);
        this.children = new Human[0];
    }

    public Pet getPet() {
        return pet;
    }


    public void addChild(Human child){
        children = Arrays.copyOf(this.children,this.children.length+1);
        children[this.children.length-1] = child;
        child.setFamily(this);
    }


    public boolean deleteChild(int index){
        Human newlist[]=new Human[0];
        int j=0;
        for(int i=0; i<=this.children.length-1; i++) {
            if (i != index) {
                newlist = Arrays.copyOf(newlist, newlist.length + 1);
                newlist[j++] = this.children[i];
            }
        }
        if (newlist==children) {
            System.out.println("Failed to delete child");
            return false;
        }
        this.children=newlist;
        System.out.println("Successfully deleted child!");
        return true;
    }
    public boolean deleteChildV2(Human child){
        Human newlist[]=new Human[0];
        for(int i=0; i<=this.children.length-1; i++) {
            if (this.children[i] != child) {
                newlist = Arrays.copyOf(newlist, newlist.length + 1);
                newlist[newlist.length-1] = child;
            }
        }
        if (newlist==children) {
            System.out.println("Failed to delete child");
            return false;
        }
        this.children=newlist;
        System.out.println("Successfully deleted child!");
        return true;
    }

    public void countOfFamilyMembers(){
        System.out.println("The number of family Members is: " + (2+ this.children.length) + "\n");
    }
    public void addPet(Pet pet){
        this.pet = pet;
    }

    public String toString() {
        return "Mother:\n" + mother.toString() + "\n\nFather:\n" + father.toString() + "\n\nChildren:\n" + Arrays.toString(children) + "\n\nPet:\n" + pet.toString() + "\n";

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }


    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }



}