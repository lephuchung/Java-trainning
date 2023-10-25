
public class Test {
	public static void main(String[] args) {
		MyDate md = new MyDate(25,3,2003);
		System.out.println("ngay: "+md.getDay());
		md.setDay(20);
		System.out.println("ngay: "+md.getDay());
	}
}
