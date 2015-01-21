import java.util.Scanner;

public class MyNameHello
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String Name,
		Password;
		System.out.println("Enter your username");
		Name = scan.nextLine();
		System.out.println("Enter your password");
		Password = scan.nextLine();
		System.out.println("Hello " + Name + ", " + "Welcome to CSC200 class! and Your password is " + Password);
	}
}

