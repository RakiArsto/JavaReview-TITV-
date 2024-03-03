//Cách xây dựng lớp và phương thức khởi tạo Constructor
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}
	public void printDay()
	{
		System.out.println("Day: " + day);
	}
	public void printMonth()
	{
		System.out.println("Month: " + month);
	}
	public void printYear()
	{
		System.out.println("Year: " + year);
	}
	public void printDate()
	{
		System.out.println("Date: " + day + "/" + month + "/" + year);
	}
}
