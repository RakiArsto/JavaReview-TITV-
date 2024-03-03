//Xử lý chuỗi trong Java - Các hàm tìm kiếm chuỗi trong Java
public class ViDu {
	public static void main(String[] args) {
		String s1 = "Xin chào các bạn, xin chào mọi người, Xin chào!";
		String s2 = "Xin chào";
		String s3 = "Xin chào 123";
		char c1 = 'ờ';
		//Hàm indexOf
		System.out.println("Hàm indexOf:");
		System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2));
		System.out.println("Vị trí của s3 trong s1 là: " + s1.indexOf(s3));
		
		//Sử dụng vị trí bắt đầu
		System.out.println("\nSử dụng vị trí bắt đầu:");
		System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2, 2));
		
		//Tìm kiếm char
		System.out.println("\nTìm kiếm char:");
		System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1));
		System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1, 20));
		
		//Hàm lastIndexOf => tìm kiếm từ phải sang trái
		System.out.println("\nHàm lastIndexOf:");
		System.out.println("Vị trí của s2 trong s1 (từ phải sang trái) là: " + s1.lastIndexOf(s2));
	}
}
