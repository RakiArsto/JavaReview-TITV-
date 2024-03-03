//Bài tập quản lý máy tính trong lập trình Java
public class MayTinh {
	private HangSanXuat hangSX;
	private Ngay ngaySX;
	private double giaBan;
	private double thoiGianBaoHanh;
	
	public MayTinh(HangSanXuat hangSX, Ngay ngaySX, double giaBan, double thoiGianBaoHanh) {
		this.hangSX = hangSX;
		this.ngaySX = ngaySX;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public HangSanXuat getHangSX() {
		return hangSX;
	}
	public void setHangSX(HangSanXuat hangSX) {
		this.hangSX = hangSX;
	}
	public Ngay getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(Ngay ngaySX) {
		this.ngaySX = ngaySX;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public double getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	public boolean ktGiaThapHon(MayTinh mtKhac) {
		return this.giaBan < mtKhac.giaBan;
	}
	public String layTenQuocGia() {
		return this.hangSX.layTenQuocGia();
	}
}