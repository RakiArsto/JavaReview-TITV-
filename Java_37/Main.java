//Bài tập quản lý sinh viên trong Java
public class Main {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(14, 8, 2004);
		Ngay ngay2 = new Ngay(31, 1, 2003);
		Ngay ngay3 = new Ngay(14, 8, 2004);
		
		System.out.println(ngay1);
		System.out.println(ngay2);
		System.out.println(ngay3);
		
		Lop lop1 = new Lop("DTH1", "Công Nghệ Thông Tin");
		Lop lop2 = new Lop("DTH2", "Khoa Học Máy Tính");
		Lop lop3 = new Lop("DTH3", "An Ninh Mạng");
		
		SinhVien sv1 = new SinhVien("182201", "Nguyễn Vũ Tuấn Kiệt", ngay1, 6.5, lop1);
		SinhVien sv2 = new SinhVien("182202", "Dương Hoàng Thái Huy", ngay2, 4, lop2);
		SinhVien sv3 = new SinhVien("182203", "Trần Thanh Hoàng", ngay3, 8, lop3);
		
		System.out.println("\nTên khoa: ");
		System.out.println("SV1: " + sv1.layTenKhoa());
		System.out.println("SV2: " + sv2.layTenKhoa());
		System.out.println("SV3: " + sv3.layTenKhoa());
		
		System.out.println("\nKiểm tra thi đạt: ");
		System.out.println("SV1: " + sv1.ktThiDat());
		System.out.println("SV2: " + sv2.ktThiDat());
		System.out.println("SV3: " + sv3.ktThiDat());
		
		System.out.println("\nSo sánh ngày sinh của sv1 và sv2: " + sv1.ktCungNgaySinh(sv2));
		System.out.println("So sánh ngày sinh của sv1 và sv3: " + sv1.ktCungNgaySinh(sv3));
	}
}