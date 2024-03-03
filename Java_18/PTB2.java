//Giải phương trình bậc 2 trong Java
import java.util.Scanner;
public class PTB2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		double x1, x2;
		double delta = 0;
		System.out.print("Nhap gia tri a: ");
		a = sc.nextFloat();
		System.out.print("Nhap gia tri b: ");
		b = sc.nextFloat();
		System.out.print("Nhap gia tri c: ");
		c = sc.nextFloat();
		if(a == 0) {
			System.out.println("a phai khac 0. Vui long nhap lai");
		}
		else {
			delta = Math.pow(b, 2) - 4 * a * c;
			if(delta < 0) {
				System.out.println("Phuong trinh vo nghiem.");
			}
			else if(delta == 0) {
				x1 = x2 = -b / (2 * a);
				System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
			}
			else {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phuong trinh co 2 nghiem phan biet:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
}
