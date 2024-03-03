//Câu lệnh điều kiện if... else trong Java
import java.util.Scanner;
public class ViDu {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen n: ");
		n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + " la so chan");
		}
		else {
			System.out.println(n + " la so le");
		}
	}
}
