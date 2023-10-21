package oopExam;

public class Iphone2 extends Iphone1 {
	public char userOfIphone2 = 'F';

	public Iphone2() {
		super(1000, "Iphone12pro", 'F', false);
		super.regularClassInfo();
		System.out.println("This is a default constructor from Iphone2 class.");
	}

	public Iphone2(char userOfIphone2) {
		super();
		super.regularClassInfo();
		this.userOfIphone2 = userOfIphone2;
		System.out.println("The User of Iphone 2 is : " + userOfIphone2);

	}

	public void iPhone2Info() {
		System.out.println("This is a void type method from Iphone2 class.");

	}

	public void iPhone2Info(char userOfIphone2) {
		super.color = "Mint";
		this.userOfIphone2 = userOfIphone2;
		System.out.println("The User of Iphone 2 is :" + userOfIphone2);

	}

	public void dropbox() {
		System.out.println(
				" we use super method to call the constructor of super class only inside the constructor of child class."
						+ "\n we use super keyword to call the methods/variables of superclass inside constructor and methods of the child class. "
						+ " \nConstructor call must be the first statement in a constructor of child class");
	}

}
