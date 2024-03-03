//Hiểu rõ phương thức GET và SET
public class MyDate {
	private int Day;
	private int Month;
	private int Year;
	
	public MyDate(int day, int month, int year)
	{
		if(day >= 1 && day <= 31) {
			Day = day;
		}
		else {
			Day = 1;
		}
		if(month >= 1 && month <= 12) {
			Month = month;
		}
		else {
			Month = 1;
		}
		if(year >= 0) {
			Year = year;
		}
		else {
			Year = 1;
		}
	}

	public int getDay()
	{
		return Day;
	}
	public void setDay(int d)
	{
		if(d >= 1 && d <= 31) {
			Day = d;
		}
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int m) {
		if(m >= 1 && m <= 12) {
			Month = m;
		}
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int y)
	{
		if(y >= 0) {
			Year = y;
		}
	}
}
