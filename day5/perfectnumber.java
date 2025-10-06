
public class perfectnumber {

	
	public static void main(String[] args) {
		int n=6;
		int sum=0;
		int i=0;
		while(i<=2);
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==n)
		{
			System.out.println("perfect number:");
		}
		else
		{
			System.out.println("not perfect number:");
		}

	}

}
