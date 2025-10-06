
public class block {
static
{
	System.out.println("i will run the java loads the main class");
}
static int count=0;
{
	System.out.println("i will run for each object creation");
	count++;
}
	public static void main(String[] args) {
block b=new block();
	block b1=new block();
	System.out.println("count");
	}
}