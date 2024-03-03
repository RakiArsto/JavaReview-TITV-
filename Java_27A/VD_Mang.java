//Giới thiệu về mảng trong Java
import java.util.Scanner;
public class VD_Mang {
	public static void main(String[] args) {
		double[] mang1;
		double mang2[];
		double[] mang3;
		System.out.println("Mảng 1");
		mang1 = new double[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < mang1.length; i++) {
			System.out.print("Nhập phần tử thứ " + i + " trong mảng: ");
			mang1[i] = sc.nextDouble();
		}
		double tong = 0;
		for (int i = 0; i < mang1.length; i++) {
			tong += mang1[i];
		}
		System.out.println("Tổng = " + tong);
		System.out.println("-----------------------");
		
		
		
		System.out.println("Mảng 2");
		mang2 = new double[] {1, 2, 3, 4, 5};
		for (int i = 0; i < mang2.length; i++) {
			System.out.println(mang2[i]);
		}
		System.out.println("-----------------------");
		
		
		
		System.out.println("Mảng 3");
		int n = 0;
		System.out.print("Nhập số lượng mảng: ");
		n = sc.nextInt();
		mang3 = new double[100];
		//Phần nhập mảng
		for (int i = 1; i <= n; i++) {
			System.out.print("Nhập phần tử thứ " + i + " trong mảng: ");
			mang3[i] = sc.nextDouble();
		}
		//Phần xuất mảng
		System.out.println("\nXuất mảng: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(mang3[i]);
			System.out.print("\t");
		}
	}
}
