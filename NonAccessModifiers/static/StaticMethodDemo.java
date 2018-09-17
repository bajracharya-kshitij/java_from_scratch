import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StaticMethodDemo {

	public static void main(String[] args) {
		String dateString1 = "1970-01-01";
		DateFormatter.getFormattedDate(dateString1);

		String dateString2 = "2018-09-17";
		DateFormatter.getFormattedDate(dateString2);		
	}
}

class DateFormatter {

	private static final List<String> MONTH_NAMES = Collections.unmodifiableList(
		Arrays.asList("January", "February", "March", "April",
						"May", "June", "July", "August",
						"September", "October", "November", "December")
		);

	private static ArrayList<String> getDateList(String dateString) {
		Pattern pattern = Pattern.compile("(\\d{4})-(\\d{1,2})-(\\d{1,2})");
		Matcher match = pattern.matcher(dateString);
		ArrayList<String> dateList = new ArrayList<String>();
		while(match.find()) {
			for(int i=1; i<=match.groupCount(); i++) {
				dateList.add(match.group(i));
			}
		}
		return dateList;
	}

	static void getFormattedDate(String dateString) {
		ArrayList<String> dateList = getDateList(dateString);
		System.out.println("The formatted date is: " + 
			MONTH_NAMES.get(Integer.parseInt(dateList.get(1))-1) + " " + 
			Integer.parseInt(dateList.get(2)) + ", " +
			dateList.get(0));
	}
}