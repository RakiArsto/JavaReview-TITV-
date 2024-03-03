//Lập trình Minigame Cá cược Tài Xỉu - sử dụng lớp Random và NumberFormat trong Java
package main;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít
 * hơn hoặc bằng số tiền họ đang có.
 * Luật chơi như sau:
 * Có 3 viên xúc xắc. Mỗi viên xúc xắc có 6 mặt có giá trị từ 1 đến 6.
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá trị xx3.
 * 1. Nếu tổng = 3 hoặc 18=> Cái ăn hết, người chơi thua.
 * 2. Nếu tổng = 4 -> 10 <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua.
 * 3. Nếu tổng = 11 -> 17 <-> tài => nếu người chơi đặt tài thì người chơi thắng, ngược lại thua.
 * */
public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoangNguoiChoi = 10000000;
		Scanner sc = new Scanner(System.in);
		
		Locale lc = new Locale("vi", "Vn");
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		
		int luaChon = 0;
		do {
			System.out.println("-----------* MỜI BẠN LỰA CHỌN *-----------");
			System.out.println("Chọn (1) để tiếp tục chơi.");
			System.out.println("Chọn (phím bất kỳ) để thoát.");
			luaChon = sc.nextInt();
			if(luaChon == 1) {
				System.out.println("**** BẮT ĐẦU CHƠI: ");
				
				//Đặt cược
				System.out.println("******** TÀI KHOẢN CỦA BẠN: " + numf.format(taiKhoangNguoiChoi) + "  , BẠN MUỐN CƯỢC BAO NHIÊU? ");
				double datCuoc = 0;
				do {
					System.out.print("******** Đặt cược (0 < số tiền cược <= " + numf.format(taiKhoangNguoiChoi) + "): ");
					datCuoc = sc.nextDouble();
				}while(datCuoc <= 0 || datCuoc > taiKhoangNguoiChoi);
				
				//Chọn tài xỉu
				int luaChonTaiXiu = 0;
				do {
					System.out.print("******** Chọn: 1 <-> Tài hoặc 2 <-> Xỉu: ");
					luaChonTaiXiu = sc.nextInt();
				}while(luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
				
				//Tung xúc xắc
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();
				
				int giaTri1 = xucXac1.nextInt(5) + 1;
				int giaTri2 = xucXac2.nextInt(5) + 1;
				int giaTri3 = xucXac3.nextInt(5) + 1;
				int tong = giaTri1 + giaTri2 + giaTri3;
				
				//Tính toán kết quả
				System.out.println("******** Kết quả: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
				if(tong == 3 || tong == 18) {
					taiKhoangNguoiChoi -= datCuoc;
					System.out.println("******** Tổng là: " + tong + " => Nhà cái ăn hết, bạn đã thua!");
					System.out.println("******** Tài khoản của bạn là: " + numf.format(taiKhoangNguoiChoi));
				}
				else if(tong >= 4 && tong <= 10) {
					System.out.println("******** Tổng là: " + tong + " => Xỉu");
					if(luaChonTaiXiu == 2) {
						System.out.println("******** BẠN ĐÃ THẮNG CƯỢC!");
						taiKhoangNguoiChoi += datCuoc;
						System.out.println("******** Tài khoản của bạn là: " + numf.format(taiKhoangNguoiChoi));
					}
					else {
						System.out.println("******** BẠN ĐÃ THUA CƯỢC!");
						taiKhoangNguoiChoi -= datCuoc;
						System.out.println("******** Tài khoản của bạn là: " + numf.format(taiKhoangNguoiChoi));
					}
				}
				else {
					System.out.println("******** Tổng là: " + tong + " => Tài");
					if(luaChonTaiXiu == 1) {
						System.out.println("******** BẠN ĐÃ THẮNG CƯỢC!");
						taiKhoangNguoiChoi += datCuoc;
						System.out.println("******** Tài khoản của bạn là: " + numf.format(taiKhoangNguoiChoi));
					}
					else {
						System.out.println("******** BẠN ĐÃ THUA CƯỢC!");
						taiKhoangNguoiChoi -= datCuoc;
						System.out.println("******** Tài khoản của bạn là: " + numf.format(taiKhoangNguoiChoi));
					}
				}
			}
		}while(luaChon == 1);
	}
}
