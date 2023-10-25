import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		
		// Khai bao bien
		int a;
		int b;
		
		// Nhap du lieu
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		a = sc.nextInt();
		System.out.println("Nhap vao so b: ");
		b = sc.nextInt();
		
		// Tinh toan
		int sum = a + b;
		int minus = a - b; 
		int nhan = a * b;
		float chia = (float)a / (float)b;
		int du = a % b;
		System.out.println(a + "+" + b + "=" + sum );
		System.out.println(a + "-" + b + "=" + minus );
		System.out.println(a + "*" + b + "=" + nhan );
		System.out.println(a + "/" + b + "=" + chia );
		System.out.println(a + "%" + b + "=" + du );
		
	}
}
