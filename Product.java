public class Product
{
	private String name;
	private float price;
	private int id;
	
	public Product(String name, float price, int id)
	{
		setName("Coca Cola");
		setPrice(f.10);
		setId(id);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public void setId(int id)
	{
		this id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public int getId()
	{
		return id;
	}
}
