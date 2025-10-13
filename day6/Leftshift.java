package compile1;

import java.io.*;
class Leftshift
{
public static void main(String args[])
{
int arr[]={10,20,30,40,50};

System.out.println("Before shift=");

for(int j=0;j<arr.length;j++)
{
System.out.println(arr[j]+ " ");
}

   int temp=arr[0];//temp=10
   int i=0;
   while(i<arr.length-1) //0<4
   {
   arr[i]=arr[i+1];
   i++;
   }
   arr[i]=temp;  //arr[4]=10

System.out.println("After shifting");
for(i=0;i<arr.length;i++)
{
System.out.println(arr[i]+ " ");
}
}
}
