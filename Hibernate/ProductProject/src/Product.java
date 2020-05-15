
public class Product {
	private int pid;
	private String pname;
	private double price;
	
	public void setPid(int pid)
	{ 
		this.pid=pid;
	}
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public int getPid()
	{
		return pid;
	}
	public String getPname()
	{
		return pname;
	}
	public double getPrice()
	{
		return price;
	}
}
