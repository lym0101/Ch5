import java.util.Scanner;

public class Triangle {

	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Value for a:");
	int a = input.nextInt();
	
	System.out.println("Value for b:");
	int b = input.nextInt();
	
	System.out.println("Value for c:");
	int c = input.nextInt();
	
	double d = Math.sqrt(Math.pow(b,2)-(4*a*c));
	
	if (a<=0|| b<=0 || c<=0) {
		System.out.print("Error... Incompatible Value");
	} else if(a >= b+c || b>= a+c || c>= b+a) {
		System.out.print("A triangle cannot be formed :(");
	} else {
		System.out.println("A triangle can be formed!");
	}
}
}

