package session5;

public class astractemployee1 extends AbstractemployeeEx {
public void futuredesignation() {
	System.out.println("Full stack");
	
}

public static void main(String[] args) {
	astractemployee1 ae = new astractemployee1();
	ae.name();
	ae.designation();
	ae.futuredesignation();
}

@Override
public void futureDesignation() {
	// TODO Auto-generated method stub
	
}

}
