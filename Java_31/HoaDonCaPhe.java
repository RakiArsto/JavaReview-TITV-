//Hiểu rõ về phương thức trong lập trình Java
public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;
	
	public HoaDonCaPhe(String ten, double gia, double kl) 
	{
		tenLoaiCaPhe = ten;
		giaTien1Kg = gia;
		khoiLuong = kl;
	}
	public double tinhTongTien()
	{
		return giaTien1Kg * khoiLuong;
	}
	public boolean ktKhoiLuongLonHon(double khoiLuong)
	{
//		if(this.khoiLuong > khoiLuong) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return this.khoiLuong > khoiLuong;
	}
	public boolean ktTongTienLonHon500k()
	{
		return tinhTongTien() > 500000;
	}
	public double giamGia(double x)
	{
		if(tinhTongTien() > 500000) {
			return (x / 100) * tinhTongTien();
		}
		else {
			return 0;
		}
	}
	public double giaSauKhiGiam(double x)
	{
		return tinhTongTien() - giamGia(x);
	}
}
