import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Guess My Number game! \n");
        
        int number = random.nextInt(100) + 1; 
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        
        System.out.print("Type a Number: ");
        
        int guess = scanner.nextInt();
        
        if (guess > number) {	
		System.out.println("Too High! Try Again!");
        System.out.print("Type a Number: ");
		guess = scanner.nextInt();
		} else if( guess < number) {
			System.out.println("Too Low! Try Again!");
			System.out.print("Type a Number: ");
			guess = scanner.nextInt();
		} else if (guess == number) {
			System.out.print("You Got IT!");
			return;
		}
		
		if (guess > number) {	
		System.out.println("Too High! Try Again!");
        System.out.print("Type a Number: ");
		guess = scanner.nextInt();
		} else if( guess < number) {
			System.out.println("Too Low! Try Again!");
			System.out.print("Type a Number: ");
			guess = scanner.nextInt();
		} else if (guess == number) {
			System.out.print("You Got IT!");
			return;
		}
		
		
		System.out.println("The Number was: " + number);
        int amtOff = Math.abs(number-guess);
        System.out.println("You were off by: " + amtOff);
	}
}
