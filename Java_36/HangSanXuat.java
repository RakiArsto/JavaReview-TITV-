//Bài tập quản lý bộ phim trong Java
public class HangSanXuat {
	private String tenHangSX, quocGia;

	public HangSanXuat(String tenHangSX, String quocGia) 
	{
		this.tenHangSX = tenHangSX;
		this.quocGia = quocGia;
	}
	public String getTenHangSX() {
		return tenHangSX;
	}
	public void setTenHangSX(String tenHangSX) {
		this.tenHangSX = tenHangSX;
	}
	public String getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
}