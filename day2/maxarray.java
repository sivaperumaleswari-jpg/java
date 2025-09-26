package com.p1;

public class maxarray {

	public static void main(String[] args) {
int  arr[]={10,30,5,40,20};
int max=arr[0];
for(int num:arr){
	if(num>max)
		max=num;
}
System.out.println("maximum=" +max);

	}

}
