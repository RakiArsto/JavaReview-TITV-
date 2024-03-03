//Hiểu rõ phương thức so sánh equals và hashcode
public class Main {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(20, 4, 2022);
		MyDate md2 = new MyDate(30, 6, 2019);
		MyDate md3 = new MyDate(20, 4, 2022);
		
		System.out.println(md1); 
		System.out.println(md2);
		System.out.println(md3);
		
//		if(md1==md3) {
//			System.out.println("md1 == md3");
//		}
//		else {
//			System.out.println("md1 != md3");
//		}
		System.out.println("md1 so sánh bằng md2: " + md1.equals(md2));
		System.out.println("md1 so sánh bằng md3: " + md1.equals(md3));
		
		System.out.println("Hashcode của md1 " + md1.hashCode());
		System.out.println("Hashcode của md2 " + md2.hashCode());
		System.out.println("Hashcode của md3 " + md3.hashCode());
	}
}
