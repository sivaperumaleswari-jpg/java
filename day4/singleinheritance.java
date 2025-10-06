import java.util.*;
public class singleinheritance {
void house()
{
	System.out.println("have own 2bhk house");
}
class son extends singleinheritance
{
	void car()
	{
		System.out.println("have own audi car");
	}
}
class single
{
	public  void main(String[] args) {
son o=new son();
o.car();
o.house();

	}
}
}
