package oopExam;

/* An abstract class is a super class that cannot be instantiated (can't create objects).
 * Contains both abstract and non abstract methods.
 * extends and implements keywords are used for the inheritance in Java for Abstract Class
 * An Abstract Class inherit another Abstract Class or a regular class by extends keyword
 * but inherit interfaces by implements keyword.
 * an Abstract Class inherit only one Abstract Class or a regular class but more than one interfaces separated by comma.
 */
public abstract class AppleWatch {

	public String iwatch;
	public int watchVersion;

	public AppleWatch() {
		System.out.println("This is a default constructor from AppleWatch class.");
	}

	public static void main(String[] args) {
		// AppleWatch appleWatch= new AppleWatch();//An abstract class can not
		// instantiated;
	}

	public abstract void abstractClassInfo();// Abstract method cann't be implemented can be define only.

	public void appleWatchInfo() {
		System.out.println(
				"An abstract class and an interface cannot be instantiated (can't create objects) but regular class can be instantiated. +/n2."
						+ "an abstract method Contains both abstract and non abstract methods where interface contains only abstract method and regular class contains only implemented method."
						+ "+/n3. an abstract class it is mandatory to write in abstract word in abstract method but an interface it is not mandatory.");

	}

}
