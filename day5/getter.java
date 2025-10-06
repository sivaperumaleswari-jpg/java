
public class getter {
private int minimumbalance=2500;
public int getminimumbalance()
{
	return minimumbalance;
}
}
class accountholder
{
	public static void main(String[] args) {
getter gg=new getter();
int min =gg.getminimumbalance();
System.out.println(min);

	}

}
