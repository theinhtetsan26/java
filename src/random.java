import java.util.Random;
import java.util.Scanner;

public class random{
    public static void main(String[] args) {
        Random random = new Random();
        int randNum = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        Scanner input = new Scanner(System.in);
        int attempts = 0; // To keep track of the number of attempts

        while (true) {
            System.out.print("Guess a number : ");
            int num = input.nextInt();
            attempts++;

            if (num == randNum) {
                System.out.println("Perfect");
                break;
            } else if (num < randNum) {
                System.out.println("Your number is less than the random number.");
            } else {
                System.out.println("Your number is greater than the random number.");
            }
        }

        // Add a scoring system based on the number of attempts
        if (attempts >= 1 && attempts <= 5) {
            System.out.println("Awesome");
        } else if (attempts >= 6 && attempts <= 10) {
            System.out.println("Good");
        } else if (attempts >= 11 && attempts <= 15) {
            System.out.println("Not bad");
        } else if (attempts >= 16 && attempts <= 20) {
            System.out.println("Bad");
        }
    }
}