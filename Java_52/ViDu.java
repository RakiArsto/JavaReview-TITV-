//Xử lý chuỗi trong Java - Cắt chuỗi, nối chuỗi, thay thế và chuyển đổi
public class ViDu {
	public static void main(String[] args) {
		String s1 = "tItv";
		String s2 = ".Vn";
		
		String s3 = s1 + s2;
		
		//Hàm concat() => nối chuỗi
		System.out.println("Hàm concat():");
		String s4 = s1.concat(s2);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		
		//Hàm replace() => thay thế
		System.out.println("\nHàm replace():");
		String s5 = "Kiet Nguyen";
		String s6 = s5.replaceAll("Kiet", "Cuong");
		System.out.println("s6 = " + s6);
		
		//Hàm toLowerCase() => chuyển về viết thuòng
		//Hàm toUpperCase() => chuyển về viết hoa
		System.out.println("\nHàm toLowerCase() và toUpperCase():");
		String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();
		System.out.println("s7 = " + s7);
		System.out.println("s8 = " + s8);
		
		//Hàm trim() => xóa khoảng trắng dư thừa ở đầu chuỗi
		System.out.println("\nHàm trim():");
		String s9 = "   Xin chào các bạn, mình là TITV.vn   ";
		System.out.println(s9.trim());
		
		//Hàm subString() => cắt chuỗi con
		System.out.println("\nHàm subString():");
		String s10 = "Xin chào các bạn, mình là TITV.vn";
		String s11 = s10.substring(10);
		String s12 = s10.substring(10, 15);
		System.out.println("s11 = " + s11);
		System.out.println("s12 = " + s12);
	}
}
