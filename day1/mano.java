package salary.java;
import java.util.Scanner;
public class mano {
		public static void main(String[] args) {
			float basic,hra,da,gross;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the basic salary:");
			basic=sc.nextFloat();
			hra=basic*0.4f;
			da=basic*0.2f;
			gross=basic+hra+da; 
			System.out.println("gross salary="+gross);
			
		 sc.close();
		}

	}



	