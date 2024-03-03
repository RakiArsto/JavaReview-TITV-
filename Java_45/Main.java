//Bài tập về kế thừa và abstract trong Java
public class Main {
	public static void main(String[] args) {
		HangSanXuat hsx1 = new HangSanXuat("Hãng 1", "Việt Nam");
		HangSanXuat hsx2 = new HangSanXuat("Hãng 2", "Trung Quốc");
		HangSanXuat hsx3 = new HangSanXuat("Hãng 3", "Tây Ban Nha");
		
		PhuongTienDiChuyen pt1 = new MayBay("Xăng", hsx1);
		PhuongTienDiChuyen pt2 = new XeOto("Trường Hải", hsx2);
		PhuongTienDiChuyen pt3 = new XeDap(hsx3);
		
		MayBay mb1 = new MayBay("Xăng", hsx1);
		
		System.out.println("Lấy hãng sản xuất");
		System.out.println("Pt1: " + pt1.layTenHangSX());
		
		System.out.println("\nBắt đầu");
		pt2.batDau();
		
		System.out.println("\nLấy vận tốc");
		System.out.println("Pt1: " + pt1.layVanToc());
		System.out.println("Pt2: " + pt2.layVanToc());
		System.out.println("Pt3: " + pt3.layVanToc());
		
		System.out.println("\nCất cánh");
		mb1.catCanh();
	}
}
