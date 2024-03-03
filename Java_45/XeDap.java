//Bài tập về kế thừa và abstract trong Java
public class XeDap extends PhuongTienDiChuyen {
	public XeDap(HangSanXuat hangSX) {
		super("Xe Đạp", hangSX);
	}
	public double layVanToc() {
		return 20;
	}
}
