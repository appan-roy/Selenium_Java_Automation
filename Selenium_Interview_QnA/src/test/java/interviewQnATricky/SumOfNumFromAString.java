package interviewQnATricky;

public class SumOfNumFromAString {

	public static void main(String[] args) {
		
//		Input: 29Java123 41Selenium 53Automation
//		Output: 29 + 123 + 41 + 53 = 246
//		Input: 12Python3 523Selenium128 8QA65;
//		Output: 12 + 3 + 523 + 128 + 8 + 65 = 739
		
		String str = "12Python3 523Selenium128 8QA65";
		int sum = 0;

		String[] strArr = str.split(" ");
		
		for (String s : strArr) {
			String[] strArr1 = s.split("[^0-9]");
			for (String s1 : strArr1) {
				if(!s1.equals(""))
					sum += Integer.parseInt(s1);
			}
		}
		
		System.out.println(sum);

	}

}
