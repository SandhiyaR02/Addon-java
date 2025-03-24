package session5;

public class person {
 private String name;
 private int age;
 
 public person(String name, int age) {
	 this.name = name;
	 this.age = age;
 }
 public person (person other) {
	 this.name = other.name;
	 this.age = other.age;
 }
 //demonstration
public String getName() {
	return name;
}

public int getAge() {
	return age;
}
public void displayInfo() {
	
	
}
 
}
