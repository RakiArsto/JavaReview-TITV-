//Bài tập quản lý sinh viên trong Java
public class SinhVien {
	private String maSV, hoTen;
	private Ngay ngaySinh;
	private double diemTB;
	private Lop lop;
	
	public SinhVien(String maSV, String hoTen, Ngay ngaySinh, double diemTB, Lop lop) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Ngay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
	
	public String layTenKhoa()
	{
		return this.lop.getTenKhoa();
	}
	public boolean ktThiDat()
	{
		return this.diemTB >= 5;
	}
	public boolean ktCungNgaySinh(SinhVien svKhac)
	{
		return this.ngaySinh.equals(svKhac.ngaySinh);
	}
}