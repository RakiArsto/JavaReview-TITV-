//Chuyển đổi số từ thập phân sang nhị phân
import java.util.Scanner;
public class ThapPhansangNhiPhan {
	public static void main(String[] args) {
		/*
		 * Chia liên tục cho 2 và lấy dư
		 * Đảo ngược chuỗi => Kết quả
		 * 10 / 2 = 5 dư 0
		 * 5 / 2 = 2 dư 1
		 * 2 / 2 = 1 dư 0
		 * 1 / 2 = 0 dư 1
		 * 1010*/
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhập số nguyên n: ");
		n = sc.nextInt();
		String nhiPhan = "";
		while(n > 0) {
			nhiPhan = (n % 2) + nhiPhan;
			n = n / 2;
		}
		System.out.println("Số hệ nhị phân là: " + nhiPhan);
	}
}
