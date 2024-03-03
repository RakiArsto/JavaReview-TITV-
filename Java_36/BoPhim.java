//Bài tập quản lý bộ phim trong Java
public class BoPhim {
	private String tenPhim;
	private int namXuatBan;
	private HangSanXuat hangSX;
	private double giaVe;
	private Ngay ngayChieu;
	
	public BoPhim(String tenPhim, int namXuatBan, HangSanXuat hangSX, double giaVe, Ngay ngayChieu) {
		this.tenPhim = tenPhim;
		this.namXuatBan = namXuatBan;
		this.hangSX = hangSX;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	public HangSanXuat getHangSX() {
		return hangSX;
	}
	public void setHangSX(HangSanXuat hangSX) {
		this.hangSX = hangSX;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public Ngay getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(Ngay ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	
	public boolean ktGiaVeReHon(BoPhim boPhimKhac)
	{
		return this.giaVe < boPhimKhac.giaVe;
	}
	public String layTenHangSX()
	{
		return this.hangSX.getTenHangSX();
	}
	public double giaSauKhuyenMai(double x)
	{
		return this.giaVe * (1 - x / 100);
	}
}