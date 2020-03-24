//------------------------------------------------------------------------------
//Demonstrates polymorphism in an array of objects.

public class EmployeeClient4 {

	public static void main(String[] args) {
		Employee[] employees = {new Employee(), new Lawyer(), new Secretary(),
				new LegalSecretary(), new Marketer(), new Janitor(), new HarvardLawyer()};
		
		//Print information about each employee.
		for (Employee e: employees) {
			System.out.print(+ e.getHours() + " hours per week ");
			System.out.printf("$%.2f, ", e.getSalary());
			System.out.print(e.getVacationDays() + " vacation days, ");
			System.out.println(e.getVacationForm() + " vacation forms. ");
			System.out.println(e); //toString representation of employee.
		}

	}

}