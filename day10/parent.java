
abstract class parent {
		abstract void repay();
		void getloan()
		{
			System.out.println("getting loan");
		}
		}
	 class son1 extends parent
		{
			void repay()
			{
				System.out.println("i will pay on behalf of my father");
			}

			public void getloan() {
				// TODO Auto-generated method stub
				
			}
		
			}
		class absdemo
		{
			public static void main(String[] args) {
				son1 s1=new son1();
				s1.getloan();
				s1.repay();

			}

		}



