import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("Nhap vao mot so duong: ");
			n = sc.nextInt();
			if (n<=0) {
				System.out.println("Nhap loi, xin moi nhap lai");
			}
		}
		while (n<=0);
		System.out.println("ok");
	}
}
