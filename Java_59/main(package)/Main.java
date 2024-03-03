//Kiểu dữ liệu Enum trong Java
package main;

public class Main {
	public static void main(String[] args) {
		ThoiKhoaBieu tkbT2 = new ThoiKhoaBieu(Day.Thứ_hai, "Toán Lý Hóa");
		ThoiKhoaBieu tkbT3 = new ThoiKhoaBieu(Day.Thứ_ba, "Văn Sử Địa");
		ThoiKhoaBieu tkbT4 = new ThoiKhoaBieu(Day.Thứ_tư, "Lý Hóa Sinh");
		ThoiKhoaBieu tkbT5 = new ThoiKhoaBieu(Day.Thứ_năm, "Tin học - GDCD - Thể dục");
		
		System.out.println(tkbT2);
		
		int x = Thang.Tháng_hai.soNgay();
		System.out.println(x + " ngày");
	}
}
