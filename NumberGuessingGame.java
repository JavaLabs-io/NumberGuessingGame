import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int target = (int) (Math.random() * 50) + 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the number between 1 and 50!");

        while (true) {
            int guess = sc.nextInt();

            if (guess == target) {
                System.out.println("Correct! You win.");
                break;
            }

            System.out.println(guess < target ? "Too low!" : "Too high!");
        }

        sc.close();
    }
}
