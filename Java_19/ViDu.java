//Câu lệnh switch... case trong Java
import java.util.Scanner;
public class ViDu {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập giá trị a: ");
		a = sc.nextInt();
		System.out.print("Nhập giá trị b: ");
		b = sc.nextInt();
		System.out.print("Nhập giá trị c: ");
		c = sc.nextInt();
		int chon = 0;
		System.out.print("Nhập số từ 1 đến 6: ");
		chon = sc.nextInt();
		switch(chon) {
		case 1:
			int kq1 = a + b;
			System.out.println("a + b => " + a + " + " + b + " = " + kq1);
			break;
		case 2:
			int kq2 = a - b;
			System.out.println("a - b => " + a + " - " + b + " = " + kq2);
			break;
		case 3:
			int kq3 = a * b;
			System.out.println("a * b => " + a + " * " + b + " = " + kq3);
			break;
		case 4:
			double kq4 = (float)a / b;
			System.out.println("a / b => " + a + " / " + b + " = " + kq4);
			break;
		case 5:
			int kq5 = a + b - c;
			System.out.println("a + b - c => " + a + " + " + b + " - " + c + " = " + kq5);
			break;
		case 6:
			double kq6 = (float)a * b / c;
			System.out.println("a * b / c => " + a + " * " + b + " / " + c + " = " + kq6);
			break;
		default:
			System.out.println("Nhập sai dữ liệu.");	
		}
	}
}
