
public class bank {
	private int minimumbalance=2500;
	public void setminimumbalance(int value)
	{
		this.minimumbalance=value;
		System.out.println(minimumbalance);
	}
	}
class accountholder1
{
	public static void main(String args[])
	{
		bank bb=new bank();
		bb.setminimumbalance(10000);
	
	}
	
	

}
