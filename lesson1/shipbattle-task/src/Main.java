import java.util.Random;
import java.util.Scanner;

public class Main {
    public void displaySquare(char[][] square){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(square[i][j] + " | ");
                if (j==5){
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        char[][] square = new char[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i==0) {
                    square[j][i] = Integer.toString(j).charAt(0);
                }
                else if (j==0) {
                    square[j][i] = Integer.toString(i).charAt(0);
                }
                else {
                    square[j][i] = '-';
                }
            }
        }

        Random randX= new Random();
        Random randY= new Random();
        int shipCoordinateY = randY.nextInt(1,6);
        int shipCoordinateX = randX.nextInt(1,6);
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(square[j][i] + " | ");
                if (j==5){
                    System.out.println();
                }
            }
        }
        while(true){
            System.out.print("Enter coordinate X: ");
            if(!input.hasNextInt()){
                System.out.println("Invalid input, please enter a number from 1 to 6");
                continue;
            }
            int x = input.nextInt();
            if (x<0 || x>5){
                System.out.println("The coordinate is out of range, please enter a number from 1 to 6");
                continue;
            }

            System.out.print("Enter coordinate Y: ");
            if(!input.hasNextInt()){
                System.out.println("Invalid input, please enter a number from 1 to 6");
                continue;
            }
            int y = input.nextInt();
            if(y<0 || y>5){
                System.out.println("The coordinate is out of range, please enter a number from 1 to 6");
                continue;
            }
            if(x==shipCoordinateX && y==shipCoordinateY){
                square[x][y]='x';
                for(int i = 0; i < 6; i++){
                    for(int j = 0; j < 6; j++){
                        System.out.print(square[j][i] + " | ");
                        if (j==5){
                            System.out.println();
                        }
                    }
                }
                System.out.println("You have won! ");
                break;
            }
            else{
                if(!(square[x][y]=='*')) {
                    square[x][y] = '*';
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(square[j][i] + " | ");
                            if (j == 5) {
                                System.out.println();
                            }
                        }
                    }
                }
                else{
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(square[j][i] + " | ");
                            if (j == 5) {
                                System.out.println();
                            }
                        }
                    }
                    System.out.println("This cell has already shot! ");
                }

            }



        }
    }
}
