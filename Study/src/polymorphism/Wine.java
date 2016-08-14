package polymorphism;

import temporary.MaoTai;

public class Wine {
	protected String nickName = "gin";
	private String name = "wine";
	int id = 2001;
	
	public Wine() {
		System.out.println("This is Wine");
	}
	
	public void drinkWine() {
		System.out.println("drink" + this.name);
		JNC jnc = new JNC();
		MaoTai mt = new MaoTai();
		System.out.println(mt.owner);
		System.out.println(jnc.flag);
	}
}
