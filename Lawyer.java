//------------------------------------------------------------------------------
//A class to represent lawyers.

public class Lawyer extends Employee {
	
	//Overrides getVacationDays from Employee class.
	public int getVacationDays() {
		return 15;
	}
	
	//Overrides getVacationForm from Employee class.
	public String getVacationForm() {
		return "pink";
	}
	
	//Lawyer's added behavior.
	public void sue() {
		System.out.println("I'll see you in court!");
	}

}