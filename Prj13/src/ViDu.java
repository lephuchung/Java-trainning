import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		
		// Khai bao bien va nhap du lieu
		System.out.println("Nhap vao gia tri cua a: ");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		
		// Thuc hien cac phep tinh viet gon va kiem tra
		System.out.println("a="+a);
		a+=3;
		System.out.println("a+=3 = "+a);
		a-=2;
		System.out.println("a-=2 = "+a);
		a*=3;
		System.out.println("a*=3 = "+a);
		a/=4;
		System.out.println("a/=4 = "+a);
		a%=3;
		System.out.println("a%=3 = "+a);
	}
}
