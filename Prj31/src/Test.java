
public class Test {
	public static void main(String[] args) {
		HoaDonCaPhe hd1 = new HoaDonCaPhe("Trung Nguyen", 100000, 1.5);
		System.out.println("Tong hoa don: " + hd1.tinhTongSoTien());
		System.out.println("Hoa don lon hon 2kg: " + hd1.kiemTraKhoiLuongLonHon(2));
		System.out.println("Hoa don lon hon 500k: " + hd1.kiemTraHoaDonLonHon500k());
	}
}
