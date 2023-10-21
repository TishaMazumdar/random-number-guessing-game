package MidSemPracticeIII;
import java.util.Scanner;

public class RandomNumGuess {
    public static void main(String args[]){
        int myNum = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("GUESS A NUMBER FROM 0 TO 100. ENTER -1 TO EXIT");
        do{
            System.out.print("Enter your number: ");
            num = sc.nextInt();
            if(num < -1){
                System.out.println("Enter -1 to exit.");
            } else if(num == -1){
                System.out.println("You quit... The number was "+myNum);
            } else if (num > 100){
                System.out.println("The number is between 0 to 100.");
            } else {
                if(num > myNum){
                    System.out.println("Too high, try again!");
                } else if (num < myNum){
                    System.out.println("Too low, try again!");
                } else {
                    System.out.println("Well done! You win!");
                    break;
                }
            }
        } while(num != -1);
    }
}
