import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex55 {
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	public static void main(String[] args)
	{
		String[] month_31days = new String[] {"January" , "Jan.","Jan","1" , "March", "Mar.", "Mar","3",
				"May","5" ,"July", "Jul", "7" , "August", "Aug.", "Aug", "8", "October", "Oct.", "Oct", "10",
				"December", "Dec.", "Dec", "12"};
		List<String> list_31days = new ArrayList<>(Arrays.asList(month_31days));
		
		String[] month_30days = new String[] {"April", "Apr.", "Apr", "4", "June", "Jun", "6",
				"September", "Sep.", "Sep", "9", "November", "Nom.", "Nom", "11" };
		List<String> list_30days = new ArrayList<>(Arrays.asList(month_30days));

		String[] febuary = new String[] {"Febuary" , "Feb." , "Feb" , "2"};
		List<String> list_feb = new ArrayList<>(Arrays.asList(febuary));
		
		System.out.println("Enter year:");
		String year;
		Scanner input = new Scanner(System.in);
		year = input.nextLine();
		while( isNumeric(year) == false || Integer.parseInt(year) < 0 )
		{
			System.out.println("Invalid year! Try again");
			year = input.nextLine();
		}
		int year_num = Integer.parseInt(year);
		String month;
		System.out.println("Enter month:");
		month = input.nextLine();
		while( list_feb.contains(month) == false && list_31days.contains(month) == false && list_30days.contains(month) == false)
		{
			System.out.println("Invalid month! Try again");
			month = input.nextLine();
		}
		if(list_31days.contains(month) == true)
		{
			System.out.println(month +" " + year_num +" has 31 days.");
		}
		else if(list_30days.contains(month) == true)
		{
			System.out.println(month +" " + year_num +" has 30 days.");
		}else if(list_feb.contains(month) == true) 
		{
			if( ((year_num%4 == 0) && (year_num%100 != 0)) || (year_num%400 ==0))
			{
				System.out.println(month +" " + year_num +" has 29 days.");
			}
			else System.out.println(month +" " + year_num +" has 28 days.");
		}
	}
}