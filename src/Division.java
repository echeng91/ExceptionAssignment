import java.util.Scanner;

class Division {
	public static void main(String[] args) {

		int a, b, result;

		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");

		a = input.nextInt();
		b = input.nextInt();
		try
		{
			result = a / b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("You cannot divide by zero.");
			while(b == 0)
			{
				System.out.print("Choose a different value for your second integer: ");
				b = input.nextInt();
				input.nextLine();
			}
		}
		finally
		{
			result = a / b;
			System.out.println("Result = " + result);
		}
	}
}