package task121;

public class DateTask {
	
	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(1, 01, 2000); // Month, Day, Year
		MyDate date2 = new MyDate(6, 21, 2025); // Month, Day, Year
		
		System.out.println(date1.toString());
		System.out.println(date2.toString());
		System.out.println("\n");
		MyDate.leapYear(date1.getYear(), date2.getYear());
		
	}

}
