public class Company
{
	private List<Product> products;
	private String name
	
	public Company(String name)
	{
		products = new LinkedList<>();
		setName("IBM");
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}