import java.util.Scanner;

public class ViDu {

	public static void main(String[] args) {
		//khai bao bien
		int a;
		Scanner sc = new Scanner(System.in);
		// Nhap du lieu
		System.out.print("Nhap vao mot so muon kiem tra: ");
		a= sc.nextInt();
		String kq =(a%2==0)?"So Chan":"So Le";
		System.out.println(a+" la "+kq);
	}

}
