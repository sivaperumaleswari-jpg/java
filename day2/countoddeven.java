package com.p1;

public class countoddeven {

	public static void main(String[] args) {
int []arr={12,7,5,20,30};
int even =0, odd =0;
for(int num:arr)
{
	if(num%2==0)
		even++;
	else 
		odd++;
}
System.out.println("Even count="+even);
System.out.println("odd count="+odd);

}
	}


