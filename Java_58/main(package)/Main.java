//Các lớp quản lý thời gian và ngày tháng trong Java
package main;

//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		
		//Hàm lấy thời gian hiện tại
		System.out.println("Hàm lấy thời gian hiện tại:");
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			System.out.println("TEST");
		}
		long t2 = System.currentTimeMillis();
		
		System.out.println("\nTrước khi chạy for: " + t1);
		System.out.println("Sau khi chạy for: " + t2);
		System.out.println("Thời gian: " + (t2 - t1) + "mls");
		System.out.println("Thời gian: " + (t2 - t1) / 1000 + "s");
		
		//TimeUnit
		System.out.println("\nTimeUnit:");
		System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000 * 365) + "s");
		System.out.println("25h = " + TimeUnit.HOURS.toSeconds(25) + "s");
		
		//Date
		System.out.println("\nDate:");
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));
		
		//Calendar
		System.out.println("\nCalendar:");
	    Calendar cld = Calendar.getInstance();
	    System.out.println(cld.get(Calendar.DATE) + "/" + (cld.get(Calendar.MONTH) + 1) + "/" + cld.get(Calendar.YEAR));
	    
	    cld.add(Calendar.HOUR, 24);
	    System.out.println(cld.get(Calendar.DATE) + "/" + (cld.get(Calendar.MONTH) + 1) + "/" + cld.get(Calendar.YEAR));
	    
	    cld.add(Calendar.DATE, 15);
	    System.out.println(cld.get(Calendar.DATE) + "/" + (cld.get(Calendar.MONTH) + 1) + "/" + cld.get(Calendar.YEAR));
		
	    //DateFormat
	    System.out.println("\nDateFormat:");
	    DateFormat df = new SimpleDateFormat();
	    System.out.println(df.format(d));
	    
	    df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	    System.out.println(df.format(d));
	    
//	    LocalDateTime ldt = LocalDateTime.now();  
//		System.out.println("Trước khi định dạng: " + ldt);  
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
//			    
//		String formattedDate = ldt.format(dtf);  
//		System.out.println("Sau khi định dạng: " + formattedDate); 
	}
}
