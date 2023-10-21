package oopExam;

public class TestPhone {

	public static void main(String[] args) {

		System.out.println("------------ default constructor is instantiated---------------");
		Iphone1 iphone1 = new Iphone1();
		iphone1.setInfo("2000");
		iphone1.setPrice(1000);
		iphone1.setUser('F');
		iphone1.setMadeinUSA(false);

		System.out.println("I bought this phone in : " + iphone1.getInfo() + ", the price was: " + iphone1.getPrice()
				+ ", User's sex : " + iphone1.getUser() + ", and boolean value for made in USA is: "
				+ iphone1.isMadeinUSA());

		System.out.println("------------ Parameterized constructor is instantiated---------------");

		Iphone1 iphone01 = new Iphone1(1000, "2000", 'F', false);
		

		iphone1.abstractClassInfo();
		iphone1.appleWatchInfo();
		iphone1.call();
		iphone1.camera();
		iphone1.interfaceInfo();
		iphone1.message();
		iphone1.regularClassInfo();
		iphone1.wireless();
		iphone1.youtube();
		iphone1.pagerInfo();
		iphone1.pagerInfo1();
		iphone1.pagerPath();
		iphone1.wakitokiInfo();

		System.out.println("------------ default constructor is instantiated from Iphone2 ---------------");

		Iphone2 iphone2 = new Iphone2();

		iphone2.dropbox();
		iphone2.iPhone2Info();
		iphone2.iPhone2Info('F');

		System.out.println("------------ Parameterized constructor is instantiated from Iphone2---------------");

		Iphone2 iphone22 = new Iphone2('F');
		
		System.out.println("------This is form IPhone3 Class------- ");

		Iphone3 iphone3 = new Iphone3();
		iphone3.Map();
		iphone3.regularClassInfo();
		
		System.out.println("------This is form IPhone4 Class------- ");

		Iphone4 iphone4 = new Iphone4();
		iphone4.photos();
		iphone4.iPhone2Info();
		iphone4.regularClassInfo();
		
		System.out.println("------This is form IPhone5 Class------- ");

		Iphone5 iphone5 = new Iphone5();
		iphone5.email();
		iphone5.photos();
		iphone5.iPhone2Info();
		iphone5.regularClassInfo();
		
		System.out.println("------This is form IPhone6 Class------- ");

		Iphone6 iphone6 = new Iphone6();
		iphone6.compass();
		iphone6.email();
		iphone6.photos();
		iphone6.iPhone2Info();
		iphone6.regularClassInfo();
		iphone6.materials(120.54f, 67.14327);
		iphone6.materials(100, 150);
		iphone6.materials(80, 130);
		iphone6.materials(110, 35, 234.5f);
		;
		iphone6.materials(85, 55, "215");
		Iphone6.materials(65, 210, 150.67);

		System.out.println("------This is form ConfiguredIphone6 Class------- ");

		ConfiguredIphone6 cnfIphone6 = new ConfiguredIphone6();
		cnfIphone6.materials(95, 421.241320);
		cnfIphone6.materials(70, 215);
		cnfIphone6.materials(85, 25, 341.32f);
		cnfIphone6.materials(55, 310, "215");
		
		System.out.println("------This is form AppleWatch Class------- ");

		AppleWatch aWatch = new Iphone1();
		aWatch.abstractClassInfo();
		aWatch.appleWatchInfo();
		
		System.out.println("------This is form Phone Class------- ");

		Phone phone = new Iphone1();

		phone.call();
		phone.camera();
		phone.interfaceInfo();
		phone.message();
		phone.wireless();
		phone.pagerInfo();
		phone.pagerInfo1();
		phone.pagerPath();
		phone.wakitokiInfo();


		
		/* IPhone2 class inherits IPhone1 class .this is called single inheritance.
		 * IPhone2 and IPhone3 inherits IPhone1. this is called hierarchical inheritance. 
		 * IPhone6 inherits IPhone5, IPhone5 inherits IPhone4, IPhone4 inherits IPhone2, IPhone2 inherits IPhone1 .This is called multilevel inheritance.
		 */

	}

}
