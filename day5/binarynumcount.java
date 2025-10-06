
public class binarynumcount {

	public static void main(String[] args) {
	int	temp=10;
		int count=0;
		while(temp>0){
			temp=temp&(temp-1);
					count++;
		}
System.out.println("binary number count: "+count);
	}

}
