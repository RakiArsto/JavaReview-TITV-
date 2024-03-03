//Xử lý chuỗi trong Java - Các hàm so sánh chuỗi trong Java
public class ViDu {
	public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "titv.vn";
		
		//Hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt hóa thường
		System.out.println("Hàm equals:");
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s3: " + s1.equals(s3));
		
		//Hàm equalsIgnoreCase, so sánh 2 chuỗi giống nhau,
		//không phân biệt chữ hóa chữ thường
		System.out.println("\nHàm equalsIgnoreCase:");
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
		
		//Nếu so sánh mật khẩu của người khi đăng nhập, 
		//Mình sẽ sử dụng equals hay equalsIgnoreCase?
		
		//Hàm compareTo => so sánh > < = 
		System.out.println("\nHàm compareTo:");
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv3 = "Nguyễn Văn";
		String sv4 = "Nguyễn Văn A";
		
		System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));
		
		//Hàm compareToIgnoreCase => Tương tự hàm compareTo, 
		//không phân biệt chữ hoa chữ thường
		System.out.println("\nHàm compareToIgnoreCase:");
		String sv5 = "NGUYỄN VĂN A";
		String sv6 = "nguyễn văn a";
		String sv7 = "nguyễn văn b";
		System.out.println("sv5 compareToIgnoreCase sv6: " + sv5.compareToIgnoreCase(sv6));
		System.out.println("sv6 compareToIgnoreCase sv7: " + sv6.compareToIgnoreCase(sv7));
		
		//Hàm regionMatches => so sánh một đoạn
		System.out.println("\nHàm regionMatches:");
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);
		
		//Hàm startWith => Hàm kiểm tra chuỗi bắt đầu bằng...
		System.out.println("\nHàm startWith:");
		String sdt = "0481985982";
		System.out.println(sdt.startsWith("048"));
		System.out.println(sdt.startsWith("049"));
		
		//Hàm endWith => Hàm kiểm tra chuỗi kết thúc bằng...
		System.out.println("\nHàm endWith:");
		String fileName = "I love you.JPG";
		String fileName2 = "Hoc Java.PDF";
		if(fileName.endsWith(".JPG")) {
			System.out.println("File 1 là hình ảnh");
		}
		else if(fileName.endsWith(".PDF")){
			System.out.println("File 1 là file PDF");
		}
		
		if(fileName2.endsWith(".JPG")) {
			System.out.println("File 2 là hình ảnh");
		}
		else if(fileName2.endsWith(".PDF")){
			System.out.println("File 2 là file PDF");
		}
	}
}
