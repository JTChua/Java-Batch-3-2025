package task121;

public class MyDate {


	private int day;
	private int month;
	private int year;
	 
	 
	 
	public MyDate(int month, int day, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	 }
	 
	 
		public int getDay() {
		 return day;
	 }
	 
		public void setDay(int day) {
		
		if (day != 0) {
			this.day = day;
		} else {
			this.day = 0;
		}
	}
	 
		public int getMonth() {
		 return month;
	 }
	 
	 public void setMonth(int month) {
		 
		if (day != 0) {
			this.month = month;
		} else {
			this.month = 0;
		}
		 
	 }
	 
	 public int getYear() {
		 return year;
	 }
	 
	 public void setYear(int year) {
		 this.year = year;
		
		 if (day != 0) {
			this.year = year;
		} else {
			this.year = 0;
		}
	 }

	 @Override
	 public String toString() {
			switch (month) {
			case 1:
				return "MyDate January " + day + ", " + year;
			case 2:
				return "MyDate February " + day + ", " + year;
			case 3:
				return "MyDate March " + day + ", " + year;
			case 4:
				return "MyDate April " + day + ", " + year;
			case 5:
				return "MyDate May " + day + ", " + year;
			case 6:
				return "MyDate June " + day + ", " + year;
			case 7:
				return "MyDate July " + day + ", " + year;
			case 8:
				return "MyDate August " + day + ", " + year;
			case 9:
				return "MyDate September " + day + ", " + year;
			case 10:
				return "MyDate October " + day + ", " + year;
			case 11:
				return "MyDate November " + day + ", " + year;
			case 12:
				return "MyDate December " + day + ", " + year;
			default:
				return "Invalid Entered Month";
			}
	 }
	 
		public static boolean isLeapYear(int year) {
	        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
	    }
	 

	 public static void leapYear(int minYear, int maxYear) {
		 
		System.out.println("Leap years between " + minYear + " and " + maxYear + ":");
		for (int i = minYear; i <= maxYear; i++ ) {
			if (isLeapYear(i)) {
                System.out.println(i);
            }
		}
		 
	 }
	 
}
