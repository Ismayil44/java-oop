import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the player: ");
        int n = sc.nextInt();

        Player[] playersarray=new Player[n];
        int i=0;
        while ( i < n) {
            System.out.println("Enter player name and score(e.g: amy 50): ");
            String name = sc.next();
            int score = sc.nextInt();
            if (isScoreInRange(score) && isOnlyLowerCase(name)) {
                playersarray[i] = new Player(name, score);
                i++;
            }

        }

        Arrays.sort(playersarray, new Checker());
        for (int j = 0; j < playersarray.length; j++) {
            System.out.println(j+1 + ". " + playersarray[j].name + " : " + playersarray[j].score);
        }
    }
    public static boolean isScoreInRange(int score){
        if (score >= 0 && score <= 1000) {return true;}
        System.out.println("The score must be between 0 and 1000");
        return false;
    }

    public static boolean isOnlyLowerCase(String name){
        for (int i = 0; i < name.length(); i++) {
            if (!(name.compareTo("a")>=0 && name.compareTo("z")<=0)){
                System.out.println("Please enter only lowercase letters!");
                return false;
            }
        }
        return true;
    }
}

