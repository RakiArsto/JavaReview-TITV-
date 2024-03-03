//Bài tập quản lý danh sách sinh viên trong Java sử dụng ArrayList
package baitap;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
	private String maSinhVien;
	private String hoVaTen;
	private int namSinh;
	private float diemTB;
	
	public SinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	
	public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTB) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	public String toString() {
		return "Mã sinh viên: " + maSinhVien + ", Họ và tên: " + hoVaTen + 
				", Năm sinh: " + namSinh + ", Điểm trung bình: " + diemTB;
	}
	public int compareTo(SinhVien o) {
		return this.maSinhVien.compareTo(o.maSinhVien);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(maSinhVien, other.maSinhVien);
	}	
}
