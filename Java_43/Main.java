//Nạp chồng phương thức-Overloading trong Java
public class Main {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println("Tìm min giữa hai con số: " + mm.timMin(5, 5));
		System.out.println("Tìm min giữa hai con số: " + mm.timMin(7.5, 6.0));
		System.out.println("Tính tổng 5 và 6: " + mm.tinhTong(5.0, 6.0));
		double[] arr = new double[] {1, 2, 3, 4, 5};
		System.out.println("Tính tổng của mảng: " + mm.tinhTong(arr));
	}
}
