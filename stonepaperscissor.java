import java.util.Scanner;
import java.util.Random;

public class StonePaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Stone", "Paper", "Scissors"};
        String userChoice, computerChoice;
        int computerChoiceIndex;
        
        System.out.println("Welcome to the Stone-Paper-Scissors game!");
        System.out.println("Enter your choice (Stone, Paper, Scissors). To exit the game, type 'exit'.");

        while (true) {
            System.out.print("Your choice: ");
            userChoice = sc.nextLine();

            if (userChoice.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for playing!");
                break;
            }

            // Validate user input
            if (!userChoice.equalsIgnoreCase("Stone") && 
                !userChoice.equalsIgnoreCase("Paper") && 
                !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice. Please enter Stone, Paper, or Scissors.");
                continue;
            }

            // Generate computer choice
            computerChoiceIndex = random.nextInt(3); // 0, 1, or 2
            computerChoice = choices[computerChoiceIndex];
            System.out.println("Computer's choice: " + computerChoice);

            // Determine the winner
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Stone") && computerChoice.equals("Scissors")) ||
                       (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Stone")) ||
                       (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

    }
}
