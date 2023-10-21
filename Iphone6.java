package oopExam;

public class Iphone6 extends Iphone5 {
	/*
	 * Multilevel inheritance use to relate to Iphone1 to 6.
	 */

	/*
	 * Method Overloading :This is called static polymorphism or early binding or
	 * method overloading or compile time polymorphism. When different methods exist
	 * with the same method name but with different parameters or signature, it is
	 * called method overloading. Method Overloading occurs during compile time.
	 * Method Overriding: This is also Called dynamic polymorphism or late binding
	 * or method overriding or run time polymorphism. When different methods exist
	 * with the same method name with same parameters or signature but with
	 * different syntax or logic, it is called method overriding. Method Overriding
	 * occurs during run time.
	 */
	public void compass() {
		System.out.println("This is void type method of Iphone6.");
	}

	public int materials(int ramPrice, int cameraPrice) {
		int total1 = ramPrice + cameraPrice;
		System.out.println("The total1 is " + total1);
		return total1;

	}

	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {
		int total2 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice);
		System.out.println("The total2 is " + total2);
		return total2;

	}

	public void materials(int romPrice, int batteryPrice, float ProcessorPrice) {
		int total3 = romPrice + batteryPrice + (int) ProcessorPrice;
		System.out.println("The total3 is " + total3);

	}

	public int materials(int chipPrice, double cameraPrice) {
		int total4 = chipPrice + (int) cameraPrice;
		System.out.println("The total4 is " + total4);
		return total4;

	}

	public final int materials(float chipPrice, double cameraPrice) {
		int total5 = (int) chipPrice + (int) cameraPrice;
		System.out.println("The total5 is " + total5);
		return total5;

	}

	public static int materials(int ramPrice, int cameraPrice, double ProcessorPrice) {
		int total6 = ramPrice + cameraPrice + (int) ProcessorPrice;
		System.out.println("The total6 is " + total6);
		return total6;

	}

}
