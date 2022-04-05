public class Memory 
{
	//creating all private variables
	private String name;
	private String favoriteHobby;
	private String favoriteDOTW;
	private String quirk;
	private double height;
	private double weight;

	//getters to get value of variables
	/**
	 * gets name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * gets hobby
	 */
	public String getHobby()
	{
		return favoriteHobby;
	}
	/**
	 * gets DOTW
	 */
	public String getDOTW()
	{
		return favoriteDOTW;
	}
	/**
	 * gets quirk
	 */
	public String getQuirk()
	{
		return quirk;
	}
	/**
	 * height
	 */
	public double getHeight()
	{
		return height;
	}
	/**
	 * gets weight
	 */
	public double getWeight()
	{
		return weight;
	}
	
	//setters to set the value of variables
	/**
	 * sets name 
	 */
	public void setName(String newName)
	{
		name = newName;
	}
	/**
	 * sets hobby
	 */
	public void setHobby(String newHobby)
	{
		favoriteHobby = newHobby;
	}
	/**
	 * sets dotw
	 */
	public void setDOTW(String newDOTW)
	{
		favoriteDOTW = newDOTW;
	}
	/**
	 * sets quirk
	 */
	public void setQuirk(String newQuirk)
	{
		quirk = newQuirk;
	}
	/**
	 * sets height
	 */
	public void setHeight(double newHeight)
	{
		height = newHeight;
	}
	/**
	 * sets weight
	 */
	public void setWeight(double newWeight)
	{
		weight = newWeight;
	}
	
	
}
