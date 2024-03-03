//Hiểu rõ về Interface trong Java
public class Main {
	public static void main(String[] args) {
		System.out.println("Kiểm tra câu a: ");
		MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
		MayTinhVinaCal500 mvn500 = new MayTinhVinaCal500();
		System.out.println("5 + 3 = " + mfx500.cong(5, 3));
		System.out.println("4 * 5 = " + mvn500.nhan(4, 5));
		System.out.println("16 / 3 = " + mvn500.chia(16, 3));
		
		System.out.println("\nKiểm tra câu b: ");
		double[] arr1 = new double[] {22, 55, 33, 77, 11, 88};
		double[] arr2 = new double[] {43, 15, 29, 33, 61, 31};
		SapXepChen sxchen = new SapXepChen();
		SapXepChon sxchon = new SapXepChon();
		System.out.println("Xuất sắp xếp chèn tăng dần: ");
		sxchen.sapXepTang(arr1);
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\nXuất sắp xếp chèn giảm dần: ");
		sxchen.sapXepGiam(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("\nXuất sắp xếp chọn tăng dần: ");
		sxchon.sapXepTang(arr1);
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\nXuất sắp xếp chọn giảm dần: ");
		sxchon.sapXepGiam(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println("\n\nKiểm tra câu c: ");
		PhanMemMayTinh pmmt = new PhanMemMayTinh();
		System.out.println("3 + 5 = " + pmmt.cong(3, 5));
		double[] arr3 = new double[] {42, 13, 74, 25, 36, 67};
		pmmt.sapXepTang(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}
