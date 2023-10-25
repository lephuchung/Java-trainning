import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Nhap vao so nguyen: ");
			n = sc.nextInt();//uu tien cai nay
		} catch (Exception e) {
			System.out.println("Nhap khong hop le!"); // try false dung cai nay
		} finally {
			System.out.println("finally:");//se chay du nhap dung hay sai
		}
		System.out.println("Gia tri nhap vao la "+n);
		System.out.println("Ket thuc chuong trinh");
	}

}
