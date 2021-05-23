public class Product
{
	private String name;
	private boolean onStock;
	
	public Product(String name, boolean onstock)
	{
		setName("Coca Cola");
		setOnStock(true);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setOnStock(boolean onStock)
	{
		this.onStock = onStock;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getOnStock()
	{
		return onStock;
	}
}
