package compile1;

import java.util.*;
class Sorting
{
public static void main(String args[])
{
int arr[]=new int[100];
int size;
int asc=1,des=1;
System.out.println("enter the size");
Scanner s=new Scanner(System.in);
size=s.nextInt();
System.out.println("enter the array values");
for(int i=0;i<size;i++)
{
arr[i]=s.nextInt();
}

for(int i=0;i<size-1;i++)//0<4
{
 if(arr[i]>arr[i+1])
   asc=0;
 else if(arr[i]<arr[i+1])
   des=0;
}
 
if(asc==0 && des==0)
{
System.out.println("Not sorted..");
}
else
{
System.out.println("Sorted..");
}
}
}
