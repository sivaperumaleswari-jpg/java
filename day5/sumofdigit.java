
public class sumofdigit {

	public static void main(String[] args) {
	int n=345;
	int sum =0;
	while(n!=0)
	{
		int a=n%10;
		sum+=a;
		n=n/10;
	}
System.out.println("sum of digits: "+sum);
}
}