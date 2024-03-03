//Bài tập về kế thừa và abstract trong Java
public abstract class PhuongTienDiChuyen {
	protected String tenLoaiDiChuyen;
	protected HangSanXuat hangSX;
	
	public PhuongTienDiChuyen(String tenLoaiDiChuyen, HangSanXuat hangSX) {
		this.tenLoaiDiChuyen = tenLoaiDiChuyen;
		this.hangSX = hangSX;
	}
	public String getTenLoaiDiChuyen() {
		return tenLoaiDiChuyen;
	}
	public void setTenLoaiDiChuyen(String tenLoaiDiChuyen) {
		this.tenLoaiDiChuyen = tenLoaiDiChuyen;
	}
	public HangSanXuat getHangSX() {
		return hangSX;
	}
	public void setHangSX(HangSanXuat hangSX) {
		this.hangSX = hangSX;
	}
	public String layTenHangSX() {
		return this.hangSX.getTenHangSX();
	}
	public void batDau() {
		System.out.println("Bắt đầu... ");
	}
	public void tangToc() {
		System.out.println("Tăng tốc... ");
	}
	public void dungLai() {
		System.out.println("Dừng lại... ");
	}
	public abstract double layVanToc();
}
