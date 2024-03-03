//Tìm kiếm, sắp xếp, copy mảng bằng các hàm có sẵn trong Java
package vidu;

public class SinhVien implements Comparable<SinhVien> {
	private int maSinhVien;
	private String hoVaTen;
	private String tenLop;
	private double diemTB;
	
	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTB) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTB = diemTB;
	}
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	public String getTen() {
		String s = this.hoVaTen.trim();
		if(s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt + 1);
		}
		else {
			return s;
		}
	}
	
	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", tenLop=" + tenLop + ", diemTB="
				+ diemTB + "]";
	}
	@Override
	public int compareTo(SinhVien o) {
		// < 0
		// = 0
		// > 0
		//Dựa trên so sánh tên
		//Tên: Adam, Barack Obama, Nguyễn Văn A, Trần Thị Thanh Yến
		String tenThis = this.getTen();
		String tenO = o.getTen();
		return tenThis.compareTo(tenO);
	}
}
