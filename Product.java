public class Product
{
	private String name;
	private float price;
	
	public Product(String name, float price)
	{
		setName("Coca Cola");
		setPrice(f.10);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public float getPrice()
	{
		return price;
	}
}