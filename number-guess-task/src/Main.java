import java.util.*;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.print("Let the game begin!\nPlease enter your name: ");
        String name = new Scanner(System.in).nextLine();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ListOfNumbers = new ArrayList<>();
        while(true){
            System.out.println("Please, try to guess the number (from 0 to 100), " + name + "!");
            int randumNum = rand.nextInt(0,10);

            while(!sc.hasNextInt()){
                System.out.println("Invalid input. Please enter an integer!");
                sc.next();
                System.out.println("Please, try to guess the number (from 0 to 100), " + name + "!");

            }
            int number = sc.nextInt();
            if(number == randumNum){
                System.out.println("Congratulations, "+ name + "!");
                ListOfNumbers.add(number);
                break;
            }
            else if (number > randumNum) {
                System.out.println("Your number is too big. Please, try again.");
            }
            else if (number < randumNum) {
                System.out.println("Your number is too small. Please, try again.");
            }
            ListOfNumbers.add(number);
        }
        ListOfNumbers.sort(Collections.reverseOrder());
        System.out.println("Your numbers: " + ListOfNumbers);
    }
}
