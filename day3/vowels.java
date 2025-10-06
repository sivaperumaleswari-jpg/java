import java.util.Scanner;

public class vowels {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("enter a string:");
		String a=s.nextLine();
		int count=0;
		for(int i=0;i<a.length();i++){
			char ch=Character.toLowerCase(a.charAt(i));
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	count++;	

	
}
}
System.out.println("count:"+count);
	}

}
