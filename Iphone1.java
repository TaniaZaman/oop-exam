package oopExam;

/*Yes, I can make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class by implements and extends keywords. 
 */

public class Iphone1 extends AppleWatch implements Phone {

	public String color;

	private int price;
	private String info;
	private char user;
	private boolean madeinUSA;

	public Iphone1() {
		System.out.println("This is a default constructor from Iphone1 class.");

	}

	public Iphone1(int price, String info, char user, boolean madeinUSA) {
		super();
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeinUSA = madeinUSA;
		System.out.println("I bought this phone in : " + info + ", the price was: " + price + ", User's sex : " + user
				+ ", and boolean value for made in USA is: " + madeinUSA);
	}

	public void regularClassInfo() {
		System.out.println("1.Regular Class can be instantiated But Abstract and Interface can not be Instantiated"
				+ "\n2.Regular Class only have implemented method but interface have declared method only and Abstract Class has both method."
				+ "\n3.Regular class Can inherit only 1 regular class or 1 abstract class where interface can inherit more than one interface by extend keyword ");
	}

	public void youtube() {
		System.out.println("This is a void type method from Iphone1 class");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeinUSA() {
		return madeinUSA;
	}

	public void setMadeinUSA(boolean madeinUSA) {
		this.madeinUSA = madeinUSA;
	}

	@Override
	public void interfaceInfo() {
		System.out.println("This interfaceInfo method is from Phone Interface.");
	}

	@Override
	public void call() {
		System.out.println("This call method is from Phone Interface.");

	}

	@Override
	public void message() {
		System.out.println("This message method is from Phone Interface.");

	}

	@Override
	public void camera() {
		System.out.println("This camera method is from Phone Interface.");
	}

	@Override
	public void abstractClassInfo() {
		System.out.println("This method is from AppleWatch abstract class");

	}

	@Override
	public void pagerPath() {
		System.out.println("This camera method is from Pager Interface.");

	}

	@Override
	public void wakitokiInfo() {
		System.out.println("This camera method is from Walkie-Talkie Interface.");

	}

}
