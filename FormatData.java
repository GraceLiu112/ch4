public class FormatData {
	public static void main(String[] args){
		Data("Tuesday", 15, "September", 2026);
	}
	public static void Data(String day, int date, String month, int year){
		System.out.println(day);
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
		System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);	
		System.out.println("European format: " + day + " " + date + " " + month + " " + year);				
	}

}
