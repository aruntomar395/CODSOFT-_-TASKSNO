import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        char playAgain;

        System.out.println("===== NUMBER GUESSING GAME =====");

        do {
            int number = random.nextInt(100) + 1;
            int attempts = 7;
            boolean guessed = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + attempts + " attempts.");

            for (int i = 1; i <= attempts; i++) {

                System.out.print("Enter your guess (Attempt " + i + "): ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Congratulations! You guessed the correct number.");

                    int score = (attempts - i + 1) * 10;
                    totalScore += score;

                    System.out.println("You earned " + score + " points.");
                    guessed = true;
                    break;
                }
                else if (guess < number) {
                    System.out.println("Too Low!");
                }
                else {
                    System.out.println("Too High!");
                }
            }

            if (!guessed) {
                System.out.println("Sorry! You used all attempts.");
                System.out.println("The correct number was: " + number);
            }

            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\nYour Total Score: " + totalScore);
        System.out.println("Thank you for playing!");

        sc.close();
    }
}
