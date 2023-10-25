import java.util.Scanner;

public class ViDu1 {
	public static void main(String[] args) {
		System.out.print("Nhap vao so muon kiem tra: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("Day la so chan");
		}
		else System.out.println("Day la so le");
	}
}
