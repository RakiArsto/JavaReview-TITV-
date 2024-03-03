//Cách sử dụng vòng lặp while trong Java
import java.util.Scanner;
public class ViDu {
	public static void main(String[] args) {
		int n = 0;
		while(n < 10) {
			n++;
			System.out.println("Số phần thưởng: " + n);
		}
		System.out.println("---------------------");
		int m = 0;
		while(m > -10) {
			m--;
			System.out.println("Tỷ lệ giảm: " + m + "%");
		}
		System.out.println("---------------------");
		int u = 1;
		Scanner sc = new Scanner(System.in);
		while(u != 0) {
			System.out.print("Nhập u = 0 thì thoát; Nhập 1 con số bất kỳ: ");
			u = sc.nextInt();
		}
		System.out.println("---------------------");
		int i = 0;
		while(true) { //Vòng lặp vô tận
			i++;
			if(i == 11) break;	
			System.out.println(i);
		}
	}
}
