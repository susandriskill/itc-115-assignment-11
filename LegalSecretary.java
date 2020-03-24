//------------------------------------------------------------------------------
//A class to represent legal secretaries.

public class LegalSecretary extends Secretary{
	
	//Overrides getSalary from Secretary class.
	public double getSalary() {
		//A legal secretary makes $5000 more than a general employee.
		return super.getSalary() + 5000;
	}
	
	//Legal secretary's added behavior.
	public void fileLegalBriefs() {
		System.out.println("I could file all day!");
	}

}