import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		//chuyen so thap phan thanh so nhi phan
		System.out.print("Nhap vao so thap phan muon chuyen: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nhiPhan = "";
		while (n!=0) {
			nhiPhan = (n%2) + nhiPhan;
			n/=2;
		}
		System.out.println("Dap an la: "+nhiPhan);
	}
}
