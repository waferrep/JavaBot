import java.util.Random;

public class Chatbot
{
	Memory newBot= new Memory(); //memory instance variable
	
	/**Custom constructor setting all memory values for the chatbot
	 */
	public Chatbot()
	{
		Random rand = new Random();
		
		//arrays for all the potential values
		String nameArray[] = {"John", "Hank", "Dorothy", "Liz", "Alex"};
		String hobbyArray[] = {"fishing", "dancing", "singing", "gaming", "hiking"};
		String dotwArray[] = {"Monday", "Tuesday", "Friday", "Sunday", "Wednesday"};
		String quirkArray[] = {"silly", "depressed", "energetic", "supportive", "relaxed"};
		double heightArray[] = {5.6, 5.2, 6.3, 4.9, 6.0};
		double weightArray[] = {128.0, 165.0, 197.0, 182.0, 225.0};
		
		//setting values by getting a random array number
		newBot.setName(nameArray[Math.abs(rand.nextInt() % nameArray.length)]);
		newBot.setHobby(hobbyArray[Math.abs(rand.nextInt() % hobbyArray.length)]);
		newBot.setDOTW(dotwArray[Math.abs(rand.nextInt() % dotwArray.length)]);
		newBot.setQuirk(quirkArray[Math.abs(rand.nextInt() % quirkArray.length)]);
		newBot.setHeight(heightArray[Math.abs(rand.nextInt() % heightArray.length)]);
		newBot.setWeight(weightArray[Math.abs(rand.nextInt() % weightArray.length)]);
	} 
	
	/** interact function, will make chatbot reply
	 */
	void interact(String userMessage)
	{

		String firstWord = ""; //used to store the first word
		int count = 0;//counter initialized, if less than 2 it checks the whole function again to find multiple keywords.
		
		//checks if usermessage contains a string (to lower to make it detect even if something is in caps) and then replies
		while (count < 2)
		{
			if (userMessage.toLowerCase().contains("hello") && !firstWord.equals("hello"))
			{
				firstWord = "hello";
				replyHello();
				++count;
			}
			else if (userMessage.toLowerCase().contains("name") && !firstWord.equals("name"))
			{
				firstWord = "name";
				replyName();
				++count;
			}
			else if (userMessage.toLowerCase().contains("favorite") && !firstWord.equals("favorite"))
			{ 
				firstWord = "favorite";
				replyFavoriteThings();
				++count;
			}
			else if (userMessage.toLowerCase().contains("quirk") && !firstWord.equals("quirk"))
			{
				firstWord = "quirk";
				replyQuirk();
				++count;
			}
			else if (userMessage.toLowerCase().contains("height") && !firstWord.equals("height"))
			{
				firstWord = "height";
				replyHeight();
				++count;
			}
			else if (userMessage.toLowerCase().contains("weight") && !firstWord.equals("weight"))
			{
				firstWord = "weight";
				replyWeight();
				++count;
			}
			else
			
				if (count < 1)
				{
					replyAskAboutUser();
					++count;
				}
				else {
					break;
					
			}
		}
	} 
	
	//All reply functions, prints prompt + values through getters
	
	/**just says hello
	 * 
	 */
	void replyHello()
	{
		System.out.println("Hello!");
	}
	/**
	 * asks prompt + gets name through getter in Memory
	 */
	void replyName()
	{
		System.out.println("My name is " + newBot.getName() + ".");
	}
	/**
	 * asks prompt + gets fav DOTW + hobby through getter in Memory
	 */
	void replyFavoriteThings()
	{
		System.out.println("My favorite days are " + newBot.getDOTW() + " and my favorite activity is " + newBot.getHobby() + ".");
	}
	/**
	 * asks prompt + gets quirk through getter in Memory
	 */
	void replyQuirk()
	{
		System.out.println("People say I'm very " + newBot.getQuirk()+ ".");
	}
	/**
	 * asks prompt + gets height through getter in Memory
	 */
	void replyHeight()
	{
		Random r = new Random();
		
		if (Math.abs(r.nextInt() % 2) == 0) //0 for feet, //1 for meters
				{
					System.out.println("I'm about " + newBot.getHeight() + " feet tall!");
				}
		else if (Math.abs(r.nextInt() % 2) == 1)
		{
			double meters = Conversion.convertFeetToMeters(newBot.getHeight());  //calls upon conversion function
			System.out.print("I'm about ");
			System.out.printf("%.2f", meters);
			System.out.println(" meters tall!");
			
		}

	}
	/**
	 * asks prompt + gets weight through getter in Memory
	 */
	void replyWeight()
	{
		System.out.println("I weight about " + newBot.getWeight() + " pounds.");
	}
	/**
	 * just prints a prompt
	 */
	void replyAskAboutUser()
	{
		System.out.println("What about you? Can you tell me more about yourself?");
	}
	
}
