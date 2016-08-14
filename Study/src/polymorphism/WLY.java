package polymorphism;

public class WLY extends Wine{
	public String name = "WLY";
	
	public WLY() {
		super();
		System.out.println("This is actully WLY");
	}
	
	public void drinkWLY() {
		System.out.println("drink " + name);
	}
	
	public void drinkWine() {
		System.out.println("drink " + name);
	}
}
