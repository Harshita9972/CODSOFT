
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        char playAgain;

        System.out.println("===== NUMBER GUESSING GAME =====");

        do {
            int number = rand.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            int maxAttempts = 5;

            System.out.println("\nGuess a number between 1 and 100");
            System.out.println("You have only " + maxAttempts + " attempts!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > number) {
                    System.out.println("Too High!");
                }
                else if (guess < number) {
                    System.out.println("Too Low!");
                }
                else {
                    System.out.println("🎉 Correct! You guessed it.");
                    score++;
                    break;
                }
            }

            if (attempts == maxAttempts && number != 0) {
                System.out.println("Out of attempts! The number was: " + number);
            }

            System.out.println("Your Score: " + score);

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Thanks for playing!");
        sc.close();
    }
}