
public class HoaDonCaPhe {
	private String ten;
	private double giaTien1KG;
	private double khoiLuong;
	
	public HoaDonCaPhe(String t, double g, double kl) {
		this.ten = t;
		this.giaTien1KG = g;
		this.khoiLuong = kl;
	}
	
	public double tinhTongSoTien() {
		return this.khoiLuong*this.giaTien1KG;
	}
	
	public boolean kiemTraKhoiLuongLonHon(double kl) {
		return this.khoiLuong>kl;
	}
	
	public boolean kiemTraHoaDonLonHon500k() {
		if (this.tinhTongSoTien()>500000) return true;
		else return false;
	}
}
