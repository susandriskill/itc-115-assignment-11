//------------------------------------------------------------------------------
//A class to represent janitors.

public class Janitor extends Employee {
	
	//Overrides getHours from Employee class.
	public int getHours() {
		//A janitor works twice as many hours as other employees.
		return super.getHours() * 2;
	}
	
	//Overrides getSalary from Employee class.
	public double getSalary() {
		//A janitor makes $10000 less than a general employee.
		return super.getSalary() - 10000;
	}
	
	//Overrides getVacationDays from Employee class.
	public int getVacationDays() {
		//A janitor gets half as much vacation as other employees.
		return super.getVacationDays() / 2;
	}
	
	//Janitor's added behavior.
	public void clean() {
		System.out.println("Workin' for the man");
	}

}