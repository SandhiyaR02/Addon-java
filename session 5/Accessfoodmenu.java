package session5;

public class Accessfoodmenu implements vegitems, Nonvegitems{

	@Override
	public void fry() {
System.out.println("chicken,mutton ,fish ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gravy() {
		System.out.println("chicken gravy,fish gravy");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakfast() {
		System.out.println("idly,dosa,poori");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lunch() {
		System.out.println("curd rice,tomato rice,briyani");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Accessfoodmenu afm  = new Accessfoodmenu();
		afm.breakfast();
		afm.lunch();
		afm.fry();
		afm.gravy();
		
		
	}

}