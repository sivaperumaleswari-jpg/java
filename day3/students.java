
public class students {
		static int id;
		static String name;
		static void display()
		{
			System.out.println("id:"+id);
			System.out.println("Name:"+name);
		}
	}
	class ece {
		public static void main(String [] args){
	students.id=101;
	students.name="Ram kumar";
	students.display();

		}

	}
