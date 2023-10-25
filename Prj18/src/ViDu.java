import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		// Giai phuong trinh bac 2: ax^2+bx+c=0
		Scanner sc = new Scanner(System.in);
		System.out.println("Giai phuong trinh bac 2: ax^2+bx+c=0");
		System.out.print("Nhap vao so a: ");
		double a = sc.nextDouble();
		System.out.print("Nhap vao so b: ");
		double b = sc.nextDouble();
		System.out.print("Nhap vao so c: ");
		double c = sc.nextDouble();
		double x, x1, x2;
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phuong trinh vo so nghiem: ");
				}
				else System.out.println("Phuong trinh vo nghiem");
			}
			else {
				x = -c/b;
				System.out.println("Phuong trinh co 1 nghiem duy nhat la: "+x);
			}
		}
		else {
			double delta = b*b - 4*a;
			if (delta > 0)
			{
				x1 = (-b-Math.sqrt(delta))/(2*a);
				x2 = (-b+Math.sqrt(delta))/(2*a);
				System.out.println("Phuong trinh co 2 nghiem phan biet la: "+x1+" va "+x2);
			}
			else if (delta == 0)
			{
				x = -b/(2*a);
				System.out.println("Phuong trinh co nghiem kep la: "+x);
			}
			else System.out.println("Phuong trinh vo nghiem");
			
		}
		
	}
}
