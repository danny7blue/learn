package valuePass;

public class ObjectPassUpdate {
	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer("Hello ");
//        System.out.println("Before change, sb = " + sb);
//        changeData(sb);
//        System.out.println("After changeData(n), sb = " + sb);
        
        SupportClass sc = new SupportClass();
        System.out.println("Before change, sc = " + sc);
        System.out.println("Before change, sc.test = " + sc.test);
        changeDataSC(sc);
//        System.out.println("After changeData(n), sc = " + sc);
//        System.out.println("After changeData(n), sc.test = " + sc.test);
	}
	private static void changeDataSC(SupportClass sc) {
		sc = new SupportClass();
		sc.test = "b";
		System.out.println("After changeData(n), sc = " + sc);
        System.out.println("After changeData(n), sc.test = " + sc.test);
	}
	public static void changeData(StringBuffer strBuf) {
        strBuf = new StringBuffer("Hi ");
        strBuf.append("World!");
 }
}
