import java.util.Scanner;

public class Main
{
	/**
	 * Creates chatbot object. + calls interact.
	 */
	public static void main(String[] args) 
	{
 		Chatbot newBot = new Chatbot(); //creates chatbot object.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Say something: ");
		String userString = input.nextLine();

		while (!userString.toLowerCase().equals("exit"))
		{
			newBot.interact(userString);
			System.out.print("Say something: ");
			userString = input.nextLine();
		}

		
	}

}
