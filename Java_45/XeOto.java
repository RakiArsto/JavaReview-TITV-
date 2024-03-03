//Bài tập về kế thừa và abstract trong Java
public class XeOto extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public XeOto(String loaiNhienLieu, HangSanXuat hangSX) {
		super("Xe Ô tô", hangSX);
		this.loaiNhienLieu = loaiNhienLieu;
	}
	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}
	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	public double layVanToc() {
		return 150;
	}
}
