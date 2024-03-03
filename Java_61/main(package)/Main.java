//Bài tập quản lý danh sách sinh viên trong Java sử dụng ArrayList
package main;
import java.util.Scanner;

import baitap.DanhSachSinhVien;
import baitap.SinhVien;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0;
		do {
			System.out.println("--------------MENU--------------");
			System.out.println(
				"1. Thêm sinh viên vào danh sách.\n"
			+	"2. In danh sách sinh viên ra màn hình.\n"
			+   "3. Kiểm tra danh sách có rỗng hay không?\n"
			+   "4. Lấy ra số lượng sinh viên trong danh sách.\n"
			+   "5. Làm rỗng danh sách sinh viên.\n"
			+   "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
			+   "7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
			+   "8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
			+   "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
			+   "0. *****THOÁT KHỎI CHƯƠNG TÌNH*****");
			System.out.print("Vui lòng chọn chức năng: ");
			luaChon = sc.nextInt();
			sc.nextLine();
			
			if(luaChon == 1) {
//				1. Thêm sinh viên vào danh sách.
				System.out.print("Nhập mã sinh viên: ");
				String maSinhVien = sc.nextLine();
				System.out.print("Nhập họ và tên: ");
				String hoVaTen = sc.nextLine();
				System.out.print("Nhập năm sinh: ");
				int namSinh = sc.nextInt();
				System.out.print("Nhập điểm trung bình: ");
				float diemTB = sc.nextFloat();
				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTB);
				dssv.themSinhVien(sv);
			}
			else if(luaChon == 2) {
//				2. In danh sách sinh viên ra màn hình.
				System.out.println();
				dssv.inDanhSachSinhVien();
				System.out.println();
			}
			else if(luaChon == 3) {
//				3. Kiểm tra danh sách có rỗng hay không?
				System.out.println("\nKiểm tra danh sách rỗng: " + dssv.ktDanhSachRong() + "\n");
			}
			else if(luaChon == 4) {
//				4. Lấy ra số lượng sinh viên trong danh sách.
				System.out.println("\nSố lượng sinh viên hiện tại: " + dssv.laySoLuongSinhVien() + "\n");
			}
			else if(luaChon == 5) {
//				5. Làm rỗng danh sách sinh viên.
				dssv.lamRongDanhSach();
				System.out.println("\nĐã làm rỗng danh sách sinh viên.\n");
			}
			else if(luaChon == 6) {
//				6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
				System.out.print("Nhập mã sinh viên: ");
				String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Kiểm tra sinh viên có trong danh sách: " + dssv.ktTonTai(sv));
			}
			else if(luaChon == 7) {
//				7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
				System.out.print("Nhập mã sinh viên: ");
				String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Xóa sinh viên trong danh sách: " + dssv.xoaSinhVien(sv));
			}
			else if(luaChon == 8) {
//				8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
				System.out.print("Nhập họ và tên: ");
				String hoVaTen = sc.nextLine();
				System.out.println("Kết quả tìm kiếm: ");
				dssv.timSinhVien(hoVaTen);
			}
			else if(luaChon == 9) {
//				9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
				dssv.sapXepSinhVienGiamDanTheoDiem();
				System.out.println();
				dssv.inDanhSachSinhVien();
				System.out.println();
			}
		}while(luaChon != 0);
	}
}
