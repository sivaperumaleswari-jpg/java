package compile1;

import java.io.*;
import java.util.*;
class Length
{
public static void main(String args[])
{
String str;
System.out.println("enter the string:");
Scanner s=new Scanner(System.in);
str=s.nextLine();
int length=0;
for(char c:str.toCharArray())
{
length++;
}
System.out.println(length);
}
}