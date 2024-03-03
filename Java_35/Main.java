//Bài tập quản lý sách trong Java
public class Main {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(20, 5, 2004);
		Ngay ngay2 = new Ngay(12, 3, 2011);
		Ngay ngay3 = new Ngay(12, 3, 2014);
		
		TacGia tacGia1 = new TacGia("Tuấn Kiệt", ngay1);
		TacGia tacGia2 = new TacGia("Tùng Lê", ngay2);
		TacGia tacGia3 = new TacGia("Peter Le", ngay3);
		
		Sach sach1 = new Sach("Lập Trình C", 10000, 2016, tacGia1);
		Sach sach2 = new Sach("Lập Trình Java", 15000, 2018, tacGia2);
		Sach sach3 = new Sach("Lập Trình Python", 20000, 2016, tacGia3);
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		System.out.println("\nSo sánh NXB sách 1 và sách 2: " + sach1.ktCungNamXuatBan(sach2));
		System.out.println("So sánh NXB sách 1 và sách 3: " + sach1.ktCungNamXuatBan(sach3));
		
		System.out.println("\nSach 1 giảm 10%: " + sach1.giaSauKhiGiam(10));
		System.out.println("Sach 2 giảm 20%: " + sach2.giaSauKhiGiam(20));
		System.out.println("Sach 3 giảm 30%: " + sach3.giaSauKhiGiam(30));
	}
}