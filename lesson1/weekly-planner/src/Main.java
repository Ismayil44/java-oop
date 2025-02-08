import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] schedule= new String[7][2];
        schedule[0][0]="Sunday";
        schedule[1][0]="Monday";
        schedule[2][0]="Tuesday";
        schedule[3][0]="Wednesday";
        schedule[4][0]="Thursday";
        schedule[5][0]="Friday";
        schedule[6][0]="Saturday";
        schedule[0][1]="do home work";
        schedule[1][1]="go to course";
        schedule[2][1]="go for a walk";
        schedule[3][1]="play football";
        schedule[4][1]="watch a movie";
        schedule[5][1]="go jogging";
        schedule[6][1]="have a rest";


        Scanner input = new Scanner(System.in);

        boolean loop = true;

        while(loop) {
            boolean isDay = false;
            System.out.print("Please, input the day of the week: ");
            String day = input.nextLine().trim();
            if (day.equals("exit")) {
                break;
            }
            for (int i = 0; i < 7; i++) {
                if (day.equalsIgnoreCase(schedule[i][0])) {
                    System.out.println("Your task for " + schedule[i][0] + " is " + schedule[i][1]);
                    isDay=true;
                    break;
                }
            }
            if(!isDay){
                 if(day.startsWith("change") || day.startsWith("reschedule")){
                     String modifyingDay=day.split(" ")[1].trim();
                     for(int i=0; i<7; i++){
                         if(modifyingDay.equalsIgnoreCase(schedule[i][0])){
                             System.out.print("Please, input new tasks for " + schedule[i][0] + ": ");
                             String tasks = input.nextLine();
                             schedule[i][1]=tasks;
                             System.out.println("Your new tasks for " + schedule[i][0] + " are " + tasks);
                         }
                     }

                 }
                 else{
                     System.out.println("Sorry, I don't understand you, please try again.");
                 }
            }
        }
    }
}
