import java.util.*;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.print("Let the game begin!\nPlease enter your name: ");
        String name = new Scanner(System.in).nextLine();
        Scanner sc = new Scanner(System.in);
        int[] ListOfNumbers = {};
        int randumNum = rand.nextInt(0,101);
        while(true){
            System.out.println("Please, try to guess the number (from 0 to 100), " + name + "!");

            while(!sc.hasNextInt()){
                System.out.println("Invalid input. Please enter an integer!");
                sc.next();
                System.out.println("Please, try to guess the number (from 0 to 100), " + name + "!");
            }
            int number = sc.nextInt();
            if(number == randumNum){
                System.out.println("Congratulations, "+ name + "!");
                ListOfNumbers = Arrays.copyOf(ListOfNumbers,ListOfNumbers.length+1);
                ListOfNumbers[ListOfNumbers.length-1]=number;
                break;
            }
            else if (number > randumNum) {
                System.out.println("Your number is too big. Please, try again.");
            }
            else if (number < randumNum) {
                System.out.println("Your number is too small. Please, try again.");
            }
            ListOfNumbers = Arrays.copyOf(ListOfNumbers,ListOfNumbers.length+1);
            ListOfNumbers[ListOfNumbers.length-1]=number;
        }
        Arrays.sort(ListOfNumbers);
        System.out.print("\nYour numbers: ");
        for(int i = ListOfNumbers.length - 1; i >=0; i--) {
            System.out.print(ListOfNumbers[i] + " ");
        }
    }
}
