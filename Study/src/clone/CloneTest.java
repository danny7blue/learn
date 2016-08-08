package clone;

public class CloneTest {
	public static void main(String[] args) {
		try {
			Person p1 = new Person("Danny", 32, new Car("Audi", 200));
			Person p2 = MyUtil.clone(p1);
			p2.getCar().setBrand("BMW");
			System.out.println(p1 + " " + p1.getClass());
			System.out.println(p2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
