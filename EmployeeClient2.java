//------------------------------------------------------------------------------
//A client program to test the Lawyer and LegalSecretary classes.

public class EmployeeClient2 {

	public static void main(String[] args) {
		System.out.print("Lawyer: ");
		Lawyer lucy = new Lawyer();
		System.out.print(lucy.getHours() + ", ");
		System.out.printf("$%.2f, ", lucy.getSalary());
		System.out.print(lucy.getVacationDays() + ", ");
		System.out.println(lucy.getVacationForm());
		lucy.sue();
		System.out.println();
		
		System.out.print("Legal Secretary: ");
		LegalSecretary leo = new LegalSecretary();
		System.out.print(leo.getHours() + ", ");
		System.out.printf("$%.2f, ", leo.getSalary());
		System.out.print(leo.getVacationDays() + ", ");
		System.out.println(leo.getVacationForm());
		leo.takeDictation("neato");
		leo.fileLegalBriefs();
		System.out.println();
		
		System.out.print("Employee: ");
		Employee edna = new Employee();
		System.out.print(edna.getHours() + ", ");
		System.out.printf("$%.2f, ", edna.getSalary());
		System.out.print(edna.getVacationDays() + ", ");
		System.out.println(edna.getVacationForm());
		System.out.println();
		
		System.out.print("Secretary: ");
		Secretary stan = new Secretary();
		System.out.print(stan.getHours() + ", ");
		System.out.printf("$%.2f, ", stan.getSalary());
		System.out.print(stan.getVacationDays() + ", ");
		System.out.println(stan.getVacationForm());
		stan.takeDictation("cool");
		System.out.println();
		
		System.out.print("Marketer: ");
		Marketer mark = new Marketer();
		System.out.print(mark.getHours() + ", ");
		System.out.printf("$%.2f, ", mark.getSalary());
		System.out.print(mark.getVacationDays() + ", ");
		System.out.println(mark.getVacationForm());
		mark.advertise();
		System.out.println();
		
		System.out.print("Janitor: ");
		Janitor joe = new Janitor();
		System.out.print(joe.getHours() + ", ");
		System.out.printf("$%.2f, ", joe.getSalary());
		System.out.print(joe.getVacationDays() + ", ");
		System.out.println(joe.getVacationForm());
		joe.clean();
		System.out.println();
		
		System.out.print("Harvard Lawyer: ");
		HarvardLawyer hallie = new HarvardLawyer();
		System.out.print(hallie.getHours() + ", ");
		System.out.printf("$%.2f, ", hallie.getSalary());
		System.out.print(hallie.getVacationDays() + ", ");
		System.out.println(hallie.getVacationForm());
		hallie.sue();
		System.out.println();		
	}

}