package oopExam;

public interface Pager {

	public void pagerPath();

	public default void pagerInfo() {
		System.out.println("This is from LandPhone Class.");
	}

	public default void pagerInfo1() {
		System.out.println("This is from LandPhone Class.");
	}

}
