package oopExam;

/*
-- Interface is a Blueprint of Class. 
-- Interface cannot be instantiated (cannot create object)
-- An interface is a collection of only Abstract methods that are defined but not implemented. 
-- From 1.8 java version Interface Contains default and static method only which are non abstract(exception)


--Interface inherit other Interfaces by extends keyword never use implements keyword but can't inherit a regular class or abstract class
--Interface inherit more than one Interfaces by extends keyword.
-- Yes Phone interface, inherit  Interface Pager and Walkie-talkie by using extends keyword.
*/
public interface Phone extends Pager, Wakitoki {

	// int number;// we can't declared a variable;
	int number = 963;// but we can initialize the variable which is by default static and final;
	// Phone() {Constructor}// Interface can not have Constructor.

	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public static void battery() {
		System.out.println("battery is a static method implemented from java version 1.8 in phone interface ");

	};

	public default void wireless() {
		System.out.println("wireless is a default method from java version in phone interface");

	};

}
