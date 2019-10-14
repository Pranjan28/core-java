package tester;
import Employee.Emp;


	public class AddEmp extends Emp {
		
			
			public static int counter;

			public static void addManager(Emp e,Emp[] list)
			{
				if(counter < list.length)
					list[counter++]=e;
				else
					System.out.println("list Full!!!!");
			}
			
			public static void addWorker(Emp e,Emp[] list)
			{
				if(counter < list.length)
					list[counter++]=e;
				else
					System.out.println("list Full!!!!");
			}


		}





