package interviewQnA;

public class OccurencesOfSubstring {

	public static void main(String[] args) {
		
		String str = "appansingharoyappansingharoyappansingharoy", subStr = "singha";
		
		int index = 0, counter = 0;
		
		while(true) {
			index = str.indexOf(subStr, index);
			if(index != -1) {
				counter++;
				index += subStr.length();
			}else {
				break;
			}
		}
		
		System.out.println(counter);

	}

}
