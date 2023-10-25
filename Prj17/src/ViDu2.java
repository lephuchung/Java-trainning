import java.util.Scanner;

public class ViDu2 {
	public static void main(String[] args) {
		double a,b,x;
		System.out.println("Giai phuong trinh bac nhat: ax+b=0");
		System.out.println("Nhap vao so a: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		System.out.println("Nhap vao so b: ");
		b = sc.nextDouble();
		if (a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			}
			else System.out.println("Phuong trinh vo nghiem");
		}
		
		else {
			x = -b/a;
			System.out.println("Nghiem cua phuong tring la: "+ x);
		}
		
	}
}
