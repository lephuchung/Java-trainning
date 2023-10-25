import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		// Switch case
		System.out.println("Nhap vao n (2<=n<=8)");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 2: {
			System.out.println("Thu 2");
			break;
		}
		case 3: {
			System.out.println("Thu 3");
			break;
		}
		case 4: {
			System.out.println("Thu 4");
			break;
		}
		case 5: {
			System.out.println("Thu 5");
			break;
		}
		case 6: {
			System.out.println("Thu 6");
			break;
		}
		case 7: {
			System.out.println("Thu 7");
			break;
		}
		case 8: {
			System.out.println("Chu nhat");
			break;
		}
		default:
			System.out.println("Nhap loi roi be oi");
		}
	}
}
