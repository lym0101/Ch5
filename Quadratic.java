import java.util.Scanner;

public class Quadratic {

	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Value for a:");
	int a = input.nextInt();
	
	System.out.println("Value for b:");
	int b = input.nextInt();
	
	System.out.println("Value for c:");
	int c = input.nextInt();
	
	double d = Math.sqrt(Math.pow(b,2)-(4*a*c));
	
	if (d<0) {
		System.out.print("Error...No Real Solution");
	} else if (d == 0) {
		System.out.print("There is only one solution! Solution: ");
		System.out.print((-b + d)/(2*a));
	} else {
		System.out.println("There is 2 solutions!");
		System.out.print("Solution 1: ");
		System.out.println((-b + d)/(2*a));
		System.out.print("Solution 2: ");
		System.out.print((-b - d)/(2*a));
	}
}
}

