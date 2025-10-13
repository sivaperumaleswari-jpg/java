package compile1;

import java.util.*;
class Skiparray
{
public static void main(String args[])
{
int arr[]=new int[100];
int size;

System.out.println("enter the size");
Scanner s=new Scanner(System.in);
size=s.nextInt();
System.out.println("enter the array values");
for(int i=0;i<size;i++)
{
arr[i]=s.nextInt();
}

for(int i=0;i<size;i+=2)
{
System.out.print(arr[i]+" ");
}

System.out.println();

for(int i=size-1;i>=0;i-=2)
{
System.out.print(arr[i]+" ");
}
}}
