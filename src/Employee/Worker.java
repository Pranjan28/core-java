package Employee;

public class Worker extends Mgr{
	 private int hoursWorked,hourlyRate; 


@Override
public String toString() {
	
	return super.toString()+hoursWorked+hourlyRate;
	
}

@Override
public double computeNetSalary()
{ 
	return basic+hoursWorked*hourlyRate;
}

public double getHourlyRate()
{ 
	return hourlyRate;
}


}