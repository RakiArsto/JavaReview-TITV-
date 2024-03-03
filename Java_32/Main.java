//Hiểu rõ phương thức GET và SET
public class Main {
	public static void main(String[] args) {
		MyDate md = new MyDate(25, 4, 2022);
		System.out.println("Day = " + md.getDay());
		md.setDay(35);
		System.out.println("Day = " + md.getDay());
		md.setDay(30);
		System.out.println("Day = " + md.getDay());
		
		System.out.println("\nMonth = " + md.getMonth());
		md.setMonth(13);
		System.out.println("Month = " + md.getMonth());
		md.setMonth(5);
		System.out.println("Month = " + md.getMonth());
		
		System.out.println("\nYear = " + md.getYear());
		md.setYear(-2002);
		System.out.println("Year = " + md.getYear());
	}
}
