package oopExam;

public class ConfiguredIphone6 extends Iphone6 {

	@Override
	public void compass() {
		System.out.println("This is void type method of Iphone6.");
	}

	@Override
	public int materials(int ramPrice, int cameraPrice) {
		int total1 = ramPrice + cameraPrice * 3;
		System.out.println("The total1 is " + total1);
		return total1;

	}

	@Override
	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {
		int total2 = (ramPrice + cameraPrice) / 2 + Integer.parseInt(ProcessorPrice);
		System.out.println("The total2 is " + total2);
		return total2;

	}

	@Override
	public void materials(int romPrice, int batteryPrice, float ProcessorPrice) {
		int total3 = romPrice + batteryPrice + (int) ProcessorPrice * 6;
		System.out.println("The total3 is " + total3);

	}

	@Override
	public int materials(int chipPrice, double cameraPrice) {
		int total4 = chipPrice / 4 + (int) cameraPrice;
		System.out.println("The total4 is " + total4);
		return total4;

	}

	// @0verride
	/*
	 * public final int materials(float chipPrice, double cameraPrice) { int total5
	 * = (int)chipPrice +(int)cameraPrice; System.out.println("The total5 is " +
	 * total5); return total5;
	 * 
	 * }
	 * 
	 * @Override public static int materials(int ramPrice, int cameraPrice, double
	 * ProcessorPrice) { int total6 = ramPrice + cameraPrice +(int)ProcessorPrice;
	 * System.out.println("The total6 is " + total6); return total6;
	 * 
	 * }
	 */

}
