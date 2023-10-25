import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int thang;
		int nam;
		System.out.print("Nhap vao thang: ");
		thang = sc.nextInt();
		System.out.print("Nhap vao nam: ");
		nam = sc.nextInt();
		switch (thang) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		{
			System.out.println("Thang co 31 ngay.");
			break;
		}
		case 4: 
		case 6:
		case 9:
		case 11:
		{
			System.out.println("Thang co 30 ngay.");
			break;
		}
		case 2:{
			if ((nam%4==0&&nam%100!=0)||nam%400==0)
			{
				System.out.println("Thang co 29 ngay.");
			}
			else System.out.println("Thang co 28 ngay.");
			break;
		}
		default:
			System.out.println("Nhap loi");
			break;
		}
	}
}
