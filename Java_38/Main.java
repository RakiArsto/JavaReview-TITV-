//Bài tập quản lý máy tính trong lập trình Java
public class Main {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(3, 6, 2020);
		Ngay ngay2 = new Ngay(13, 7, 2021);
		Ngay ngay3 = new Ngay(18, 10, 2019);
		
		System.out.println(ngay1);
		System.out.println(ngay2);
		System.out.println(ngay3);
		
		QuocGia quocgia1 = new QuocGia("VN", "Việt Nam");
		QuocGia quocgia2 = new QuocGia("US", "Hoa Kỳ");
		QuocGia quocgia3 = new QuocGia("JP", "Nhật Bản");
		
		HangSanXuat hangSX1 = new HangSanXuat("Dell", quocgia1);
		HangSanXuat hangSX2 = new HangSanXuat("ASUS", quocgia2);
		HangSanXuat hangSX3 = new HangSanXuat("HP", quocgia3);
		
		MayTinh mt1 = new MayTinh(hangSX1, ngay1, 12000000, 12);
		MayTinh mt2 = new MayTinh(hangSX2, ngay2, 16000000, 24);
		MayTinh mt3 = new MayTinh(hangSX3, ngay3, 10000000, 12);
		
		System.out.println("\nSo sánh giá bán của mt1 < mt2: " + mt1.ktGiaThapHon(mt2));
		System.out.println("So sánh giá bán của mt2 < mt3: " + mt2.ktGiaThapHon(mt3));
		
		System.out.println("\nTên quốc gia: ");
		System.out.println("MT1: " + mt1.layTenQuocGia());
		System.out.println("MT2: " + mt2.layTenQuocGia());
		System.out.println("MT3: " + mt3.layTenQuocGia());
	}
}