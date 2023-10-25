
public class ViDu {
	public static void main(String[] args) {
		int i = 0;
		// Break khong co lable
		do {
			i++;
			System.out.println("i="+i);
			if(i==5) {
				break;
			}
		}
		while (true);
		// Break co lable
		int k,j=0;
		outer: for (k=0;k<5;k++) {
			for (j=0;j<6;j++) {
				if(j==3) break outer; // break ra khoi ham for co lable outer
			}
		}
		System.out.println("k="+k+" j="+j);
		// Continue
		for(int n=0; n<5; n++) {
			if(n>2) {
				continue;
			}
			System.out.println(n);
		}
		// Return
		for(int n=0; n<5; n++) {
			if(n>3) {
				return;
			}
			System.out.println(n);
		}
	}
}
