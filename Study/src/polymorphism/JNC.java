package polymorphism;

import temporary.MaoTai;

public class JNC extends Wine{
	private String name = "JNC";
	protected int age = 15;
	boolean flag = true;
	
	public JNC() {
		super();
	}
	
	public void drinkJNC() {
		System.out.println("drink " + name);
		System.out.println(super.id);
	}
	
//	public void drinkWine() {
//		System.out.println("drink " + name);
//	}
	
	public static void main(String[] args) {
		Wine jnc = new JNC();
		Wine wly = new WLY();
		jnc.drinkWine();
		wly.drinkWine();
		JNC realJNC = new JNC();
		realJNC.drinkJNC();
		System.out.println(realJNC.name);
		MaoTai mt = new MaoTai();
		mt.drinkWine();
	}
}
