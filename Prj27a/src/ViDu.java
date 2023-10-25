import java.util.Iterator;
import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		double mang1[];
		double[] mang2;
		Scanner sc = new Scanner(System.in);
		// khai bao mang
		mang1 = new double[10];
		for (int i = 0; i < mang1.length; i++) {
			System.out.println("a["+i+"]=");
			mang1[i]=sc.nextDouble();
		}
		mang2 = new double[]{1,2,3,4};
		for (int i = 0; i < mang2.length; i++) {
			System.out.println(mang2[i]);
		}
		for (int i = 0; i < mang1.length; i++) {
			System.out.println(mang1[i]);
		}
	}
}
