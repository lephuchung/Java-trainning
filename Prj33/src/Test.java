
public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(06, 01, 2003);
		MyDate md2 = new MyDate(20, 04, 2003);
		md2.setDay(25);
		System.out.println(md1.toString());
		System.out.println(md2.toString());
	}
	
}
