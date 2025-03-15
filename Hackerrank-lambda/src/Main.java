import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you wish to enter: ");
        int n = sc.nextInt();
        int[] oplist = new int[n];
        int[] numlist = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the operation number(1-isOdd, 2-isPrime, 3-isPalindrome) and a number to perform(e.g. 1 10): ");
            int op = sc.nextInt();
            int num = sc.nextInt();
            oplist[i] = op;
            numlist[i] = num;
        }



        PerformOperation isOdd = (num1) -> {
            if (num1 % 2 == 0){
                System.out.println("EVEN");
                return false;}
            System.out.println("ODD");
            return true;
        };
        PerformOperation isPrime = (num1) -> {
            if (num1==2){
                System.out.println("PRIME");
                return true;
            }
            else {
                for (int i = 2; i < num1 / 2 + 1; i++) {
                    if (num1 % i == 0) {
                        System.out.println("COMPOSITE");
                        return false;
                    }
                }
                System.out.println("PRIME");
                return true;
            }
        };
        PerformOperation IsPalindrome = (num1) -> {
            int reverse = 0;
            int original = num1;
            while (num1 != 0) {
                reverse = reverse * 10 + num1 % 10;
                num1 = num1 / 10;
            }
            if (reverse == original) {
                System.out.println("PALINDROME");
                return true;
            }
            System.out.println("NOT PALINDROME");
            return false;
        };

        for(int i=0 ; i<n ; i++){
            if(oplist[i]==1){
                isOdd.perform(numlist[i]);
            }
            else if(oplist[i]==2){
                isPrime.perform(numlist[i]);
            }
            else if(oplist[i]==3){
                IsPalindrome.perform(numlist[i]);
            }
        }


    }
}