//Bài tập về kế thừa và abstract trong Java
public class MayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public MayBay(String loaiNhienLieu, HangSanXuat hangSX) {
		super("Máy bay", hangSX);
		this.loaiNhienLieu = loaiNhienLieu;
	}
	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}
	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	public double layVanToc() {
		return 500;
	}
	public void catCanh() {
		System.out.println("Cất cánh... ");
	}
	public void haCanh() {
		System.out.println("Hạ cánh... ");
	}
}
