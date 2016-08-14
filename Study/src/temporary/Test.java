package temporary;

public class Test implements Runnable{

	public static void main(String[] args) {
		String[] test = new String[]{"A", "B"};
		System.out.println(test.length);
		String a = "hello";
		System.out.println(a.length());
		
		System.out.println(Integer.parseInt("123"));
		
		MaoTai mt = new MaoTai();
		System.out.println(mt.getClass());
		System.out.println(MaoTai.class);
		
		
		Integer temp = 3;
		Integer temp2 = new Integer(3);
		int temp3 = 3;
		
		System.out.println(temp==temp2);
		System.out.println(temp == temp3);
	}

	@Override
	public void run() {
		
	}

}
