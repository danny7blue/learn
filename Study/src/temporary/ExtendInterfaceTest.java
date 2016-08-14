package temporary;

public class ExtendInterfaceTest implements InterfaceTest{
	public static void main(String[] args) {
		InterfaceTest.name = "Daisy";
	}

	@Override
	public void hello() {
		System.out.println("Hello");
	}
}
