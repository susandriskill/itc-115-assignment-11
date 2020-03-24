//------------------------------------------------------------------------------
//Demonstrates polymorphism by passing many types of employees as parameters to
//the same method.

public class EmployeeClient3 {

	public static void main(String[] args) {
		Employee edna = new Employee();
		Lawyer lucy = new Lawyer();
		Secretary stan = new Secretary();
		LegalSecretary leo = new LegalSecretary();
		Marketer mark = new Marketer();
		Janitor joe = new Janitor();
		HarvardLawyer hallie = new HarvardLawyer();
		
		
		
		printInfo(edna);
		printInfo(lucy);
		printInfo(stan);
		printInfo(leo);
		printInfo(mark);
		printInfo(joe);
		printInfo(hallie);
	}
	
	//Prints information about any kind of employee.
	public static void printInfo(Employee e) {
		System.out.print(e.getHours() + ", ");
		System.out.printf("$%.2f, ", e.getSalary());
		System.out.print(e.getVacationDays() + ", ");
		System.out.print(e.getVacationForm() + ", ");
		System.out.println(e); //toString representation of employee.
	}

}
