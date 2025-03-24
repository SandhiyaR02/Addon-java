package session5;

public class Accessperson {
	public static void main(String[] args) {
		//originaln person object
		person originalPerson  = new person ("sandy",19);
		//copied person object
		person copiedPerson = new person (originalPerson);
		
		System.out.println("Original person:");
		originalPerson.displayInfo();
		System.out.println("Copied Person");
		originalPerson.displayInfo();
		
	}

}
