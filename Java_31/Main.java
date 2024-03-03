//Hiểu rõ về phương thức trong lập trình Java
public class Main {
	public static void main(String[] args) {
		HoaDonCaPhe hdcp = new HoaDonCaPhe("Trung Nguyên", 100000, 1.5);
		HoaDonCaPhe hdcp2 = new HoaDonCaPhe("Vina", 120000, 5.5);
		System.out.println("Tổng tiền của hdcp: " + hdcp.tinhTongTien());
		System.out.println("Kiểm tra khối lượng > 2kg: " + hdcp.ktKhoiLuongLonHon(2));
		System.out.println("Kiểm tra khối lượng > 1kg: " + hdcp.ktKhoiLuongLonHon(1));
		System.out.println("Kiểm tra tổng tiền > 500k: " + hdcp.ktTongTienLonHon500k());
		System.out.println("Giảm giá của hdcp: " + hdcp.giamGia(10));
		System.out.println("Sau giảm giá của hdcp: " + hdcp.giaSauKhiGiam(10));
		System.out.println("\nTổng tiền của hdcp2: " + hdcp2.tinhTongTien());
		System.out.println("Giảm giá của hdcp2: " + hdcp2.giamGia(10));
		System.out.println("Sau giảm giá của hdcp2: " + hdcp2.giaSauKhiGiam(10));
	}
}	
 