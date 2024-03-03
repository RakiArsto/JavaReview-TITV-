//Câu lệnh điều kiện if... else trong Java
import java.util.Scanner;
public class PTB1 {
	public static void main(String[] args) {
		float a, b;
		float x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap gia tri a: ");
		a = sc.nextFloat();
		System.out.print("Nhap gia tri b: ");
		b = sc.nextFloat();
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh vo so nghiem.");
			}
			else {
				System.out.println("Phuong trinh vo nghiem.");
			}
		}
		else {
			x = (float)-b / a;
		}
		System.out.println("Phuong trinh co nghiem x = " + x);
	}
}
