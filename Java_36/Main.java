//Bài tập quản lý bộ phim trong Java
public class Main {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(14, 9, 2017);
		Ngay ngay2 = new Ngay(23, 11, 2018);
		Ngay ngay3 = new Ngay(6, 2, 2022);
		
		System.out.println(ngay1);
		System.out.println(ngay2);
		System.out.println(ngay3);
		
		HangSanXuat hangSX1 = new HangSanXuat("Hãng A", "Việt Nam");
		HangSanXuat hangSX2 = new HangSanXuat("Hãng B", "Trung Quốc");
		HangSanXuat hangSX3 = new HangSanXuat("Hãng C", "Nhật Bản");
		
		BoPhim bophim1 = new BoPhim("Godzilla", 2016, hangSX1, 100000, ngay1);
		BoPhim bophim2 = new BoPhim("Hitman's Bodyguard", 2017, hangSX2, 250000, ngay2);
		BoPhim bophim3 = new BoPhim("Minions", 2015, hangSX3, 200000, ngay3);
		
		System.out.println("So sánh giá vé bộ phim 1 và 2: " + bophim1.ktGiaVeReHon(bophim2));
		System.out.println("So sánh giá vé bộ phim 2 và 3: " + bophim2.ktGiaVeReHon(bophim3));
		
		System.out.println("\nTên hãng sản xuất bộ phim 1: " + bophim1.layTenHangSX());
		System.out.println("Tên hãng sản xuất bộ phim 2: " + bophim2.layTenHangSX());
		System.out.println("Tên hãng sản xuất bộ phim 3: " + bophim3.layTenHangSX());
		
		System.out.println("\nGiá vé giảm 10% cho bộ phim 1: " + bophim1.giaSauKhuyenMai(10));
		System.out.println("Giá vé giảm 10% cho bộ phim 2: " + bophim2.giaSauKhuyenMai(20));
		System.out.println("Giá vé giảm 10% cho bộ phim 3: " + bophim3.giaSauKhuyenMai(50));
	}
}