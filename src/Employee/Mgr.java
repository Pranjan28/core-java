package Employee;

public class Mgr extends Emp {

	
	private double perfBonus;
	
	


@Override
public String toString() {
	
	return super.toString()+perfBonus;
	
}
@Override
public double computeNetSalary()
{ 
	return basic+perfBonus;
}

public double perfBonus()
{ 
	return perfBonus;
}


}

