package temporary;

import polymorphism.Wine;

public class MaoTai extends Wine{
	public String owner = "Danny";
	String name = "MaoTai";
	protected int age = 13;
	
	public MaoTai() {
		super();
	}
	
	public void drinkWine() {
		System.out.println("drink " + super.nickName);
	}
}
