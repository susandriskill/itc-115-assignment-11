//------------------------------------------------------------------------------
//A class to represent Harvard-graduated lawyers.

public class HarvardLawyer extends Lawyer{
	
	//Overrides getSalary from Lawyer class.
	public double getSalary() {
		return super.getSalary() + (super.getSalary() * .20);
	}
	
	//Overrides getVacationDays from Lawyer class.
	public int getVacationDays() {
		return super.getVacationDays()+ 3;
	}
	
	
	//Overrides getVacationForm from Lawyer class.
	public String getVacationForm() {
		return "pinkpinkpinkpink";
	}
	
}