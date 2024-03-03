//Xử lý chuỗi trong Java - Lấy độ dài chuỗi và ký tự trong chuỗi Java
import java.util.Scanner;
public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("Nhập vào chuỗi: ");
		s = sc.nextLine();
		System.out.println("------------");
		
		//Hàm length() => lấy độ dài chuỗi
		System.out.println(s.length());
		int doDai = s.length();
		//Hàm charAt() => lấy ra một ký tự tại vị trí
		for (int i = 0; i < doDai; i++) {
			System.out.println("Vị trí " + i + " là: " + s.charAt(i));
		}
		//Hàm getChars(vị trí bắt đầu, vị trí kết thúc, 
		//mảng lưu dữ liệu, vị trí bắt đầu lưu của mảng)
		char[] arrayChar = new char[100];
		s.getChars(2, 5, arrayChar, 0);
		for (int i = 0; i < arrayChar.length; i++) {
			System.out.println("Giá trị của mảng tại " + i + " là: " + arrayChar[i]);
		}
		//Hàm getBytes() => có 3 cách, lấy ra mảng giá trị 
		//của các ký tự thành một mảng
		byte[] arrayBytes = s.getBytes();
		for(byte b : arrayBytes) {
			System.out.println(b);
		}
	}
}