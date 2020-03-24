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
		
		System.out.print("Legal Secretary: ");
		LegalSecretary leo = new LegalSecretary();
		System.out.print(leo.getHours() + ", ");
		System.out.printf("$%.2f, ", leo.getSalary());
		System.out.print(leo.getVacationDays() + ", ");
		System.out.println(leo.getVacationForm());
		leo.takeDictation("neato");
		leo.fileLegalBriefs();
	}

}
