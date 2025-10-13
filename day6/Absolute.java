package compile1;


import java.util.*;
class Absolute
{
public static void main(String args[])
{
int arr[]=new int[100];
int size;
int odd=0,even=0;
System.out.println("enter the size");
Scanner s=new Scanner(System.in);
size=s.nextInt();
System.out.println("enter the array values");
for(int i=0;i<size;i++)
{
arr[i]=s.nextInt();
}

for(int i=0;i<size;i++)
{
 if(arr[i]%2==0)
   even+=arr[i];
 else
   odd+=arr[i];
}

int sum=odd-even;

if(sum<0)
 sum=-sum;

System.out.println("Absolute difference="+sum);

}
}

