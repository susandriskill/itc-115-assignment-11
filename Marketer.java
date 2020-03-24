//------------------------------------------------------------------------------
//A class to represent marketers.

public class Marketer extends Employee {
	
	//Overrides getSalary from Employee class.
	public double getSalary() {
		//A marketer makes $10000 more than a general employee.
		return super.getSalary() + 10000;
	}
	
	//Marketer's added behavior.
	public void advertise() {
		System.out.println("Act now, while supplies last!");
	}

}