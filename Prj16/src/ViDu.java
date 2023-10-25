import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		// Khai bao bien
		double r, cv, dt;
		double a, b;
		Scanner sc = new Scanner(System.in);
		// Nhap gia tri
		System.out.print("Nhap vao gia tri cua a: ");
		a = sc.nextDouble();
		System.out.print("Nhap vao gia tri cua b: ");
		b = sc.nextDouble();
		// Thuc hanh Math.
		System.out.println("Tri tuyet doi cua a = "+ Math.abs(a));
		System.out.println("Lam tron len cua a = "+ Math.ceil(a));
		System.out.println("Lam tron xuong cua a = "+ Math.floor(a));
		System.out.println("Can bac hai cua a = "+ Math.sqrt(a));
		// Tinh chu vi va dien tich hinh tron
		System.out.print("Nhap vao ban kinh hinh tron: ");
		r = sc.nextDouble();
		cv = 2*Math.PI*r;
		dt = Math.PI*Math.pow(r, 2);
		System.out.println("Chu vi la: "+ cv);
		System.out.println("Dien tich la: "+ dt);
	}
}
