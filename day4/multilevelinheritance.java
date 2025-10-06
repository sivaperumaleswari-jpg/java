
public class multilevelinheritance {
void land()
{
	System.out.println("5 acres of land");
}
}
class father extends multilevelinheritance
{
	void house()
	{
		System.out.println("have own 2bhk house");
	}
	}
class son extends father
{
	void car()
	{
		System.out.println("have own audi car");
	}
	}
class multilevel
{
	public static void main(String[] args) {
son o=new son();
o.car();
o.house();
o.land();
	

	}

}
