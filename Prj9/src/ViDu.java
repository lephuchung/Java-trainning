import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ten: ");
		String hoTen = sc.nextLine();
		System.out.println("Nhap vao tuoi: ");
		int tuoi = sc.nextInt();
		System.out.println("Nhap vao ma so sinh vien: ");
		long MSSV = sc.nextLong();
		System.out.println("Nhap vao diem: ");
		float diem = sc.nextFloat();
		System.out.println("----------");
		System.out.println(hoTen);
		System.out.println(tuoi);
		System.out.println(MSSV);
		System.out.println(diem);
	}
}
