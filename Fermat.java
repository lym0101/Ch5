import java.util.Scanner;

public class Fermat {

	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Value for a:");
	int a = input.nextInt();
	
	System.out.println("Value for b:");
	int b = input.nextInt();
	
	System.out.println("Value for c:");
	int c = input.nextInt();
	
	System.out.println("Value for n:");
	int n = input.nextInt();
	
	if (n>=2) {
	System.out.println("Cannot be applied here.");
	} else if (Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n)){
	System.out.println("Holy Smokes, Fermat was wrong!");
	} else {
		System.out.println("No, that doesn’t work.");
	}
}
}
