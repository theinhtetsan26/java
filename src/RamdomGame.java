import java.util.Random;
import java.util.Scanner;

public class RamdomGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randNum = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        Scanner input = new Scanner(System.in);
        int times = 0; // To keep track of the number of attempts

        while (true) {
            System.out.print("Guess a number : ");
            int num = input.nextInt();
            times++;

            if (num == randNum) {
                System.out.println("Perfect");
                break;
            } else if (num < randNum) {
                System.out.println("Your number is less than the random number.");
            } else {
                System.out.println("Your number is greater than the random number.");
            }
        }
        System.out.println("times"+ times);

        if (times >= 1 && times <= 5) {
            System.out.println("Awesome");
        } else if (times >= 6 && times <= 10) {
            System.out.println("Good");
        } else if (times >= 11 && times <= 15) {
            System.out.println("Not bad");
        } else if (times >= 16 &&times <= 20) {
            System.out.println("Bad");
        }
    }
}