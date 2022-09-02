package stringDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String prog_lang = "C-Java-Python-VBA";
		
		String []arr = prog_lang.split("-");
		
		for (int i = 0; i < prog_lang.length(); i++){
			
			System.out.println("Value for "+i+" is "+arr[i]);
			
			if (arr[i].equalsIgnoreCase("python")){
				
				break;
				
			}
		}
		
		
	}

}
