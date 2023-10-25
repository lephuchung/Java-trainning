import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap vao gia tri cua a: ");
		a=sc.nextInt();
		System.out.print("Nhap vao gia tri cua b: ");
		b=sc.nextInt();
		System.out.println(a+" == "+b+" : "+(a==b));
		System.out.println(a+" != "+b+" : "+(a!=b));
		System.out.println(a+" < "+b+" : "+(a<b));
		System.out.println(a+" > "+b+" : "+(a>b));
		System.out.println(a+" <= "+b+" : "+(a<=b));
		System.out.println(a+" >= "+b+" : "+(a>=b));
		System.out.println("Ca hai so deu la so chan :" + ((a%2==0)&&(b%2==0)));
		System.out.println("It nhat 1 so la so chan :" + ((a%2==0)||(b%2==0)));
	}
}
