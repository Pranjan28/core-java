package Employee;

public class Emp {

	private int id;
	public static int count;
	private String name,email,deptId;
	public double basic;
	
	static
	{
		count=100;
	}
	
	public Emp()
	{

		id=count++;
	}
	
	public double computeNetSalary()
	{
		return -1;
		
	}
	
 @Override
	public String toString() {
	
return "id:" + "name: " + " email: "+" deptId= " + basic ;
}
 }
	










