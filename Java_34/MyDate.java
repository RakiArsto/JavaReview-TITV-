//Hiểu rõ phương thức so sánh equals và hashcode
import java.util.Objects;

public class MyDate {
	private int Day;
	private int Month;
	private int Year;
	
	public MyDate(int day, int month, int year) 
	{
		if (day >= 1 && day <= 31) {
			Day = day;
		} 
		else {
			Day = 1;
		}
		if (month >= 1 && month <= 12) {
			Month = month;
		} 
		else {
			Month = 1;
		}
		if (year >= 1) {
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
		if (d >= 1 && d <= 31) {
			Day = d;
		} 
	}
	public int getMonth() 
	{
		return Month;
	}
	public void setMonth(int m) 
	{
		if (m >= 1 && m <= 12) {
			Month = m;
		}
	}
	public int getYear() 
	{
		return Year;
	}
	public void setYear(int y) 
	{
		if (y >= 1) {
			Year = y;
		}
	}

	@Override
	public String toString() 
	{
		return Day + "/" + Month + "/" + Year;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Day;
		result = prime * result + Month;
		result = prime * result + Year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		MyDate other = (MyDate) obj;
		if(this.Day != other.Day) {
			return false;
		}
		if(this.Month != other.Month) {
			return false;
		}
		if(this.Year != other.Year) {
			return false;
		}
		return true;
	}
}