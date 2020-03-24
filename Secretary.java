//------------------------------------------------------------------------------
//A class to represent secretaries.

public class Secretary extends Employee {
	
	//Secretary's added behavior.
	public void takeDictation(String text) {
		System.out.println("Dictation text: " + text);
	}

}
