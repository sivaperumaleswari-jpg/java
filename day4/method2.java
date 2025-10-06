import java.util.Scanner;
 class java2{
public void sub(int x,int y)
{
	System.out.println("subtract="+(x-y)); 
}
}
class method2
{
	public static void main(String[] args) {
		java2 o=new java2();
		Scanner s =new Scanner(System.in);
        int a=s.nextInt();
		int b=s.nextInt();
		o.sub(a,b);
s.close();
	}
}