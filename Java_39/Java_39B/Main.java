//Khái niệm về kế thừa trong Java
public class Main {
	public static void main(String[] args) {
		System.out.println("Kiểm tra con người: ");
		ConNguoi cn = new ConNguoi("Kiệt", 2004);
		cn.an();
		cn.uong();
		cn.ngu();
		System.out.println("\nKiểm tra học sinh: ");
		HocSinh hs = new HocSinh("Nguyễn Vũ Tuấn Kiệt", 2004, "22DTH1", "Đại học DNTU");
		hs.an();
		hs.uong();
		hs.ngu();
		hs.lamBaiTap();
	}
}
