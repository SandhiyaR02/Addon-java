package session5;

public class Accessbirdaction extends bird implements flyable{

	@Override
	public void fly() {
		System.out.println("Bird flys...");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Accessbirdaction aba = new Accessbirdaction();
		aba.eat();
		aba.fly();
	}

}
