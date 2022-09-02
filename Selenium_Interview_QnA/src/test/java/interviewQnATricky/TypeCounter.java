package interviewQnATricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TypeCounter {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        TypeCounter.typeCounter(sentence);

        bufferedReader.close();

	}

	public static void typeCounter(String sentence) {
        int strCounter = 0, intCounter = 0, dblCounter = 0;
        String[] senArray = sentence.replaceAll("( )+", " ").split("\\s");
        for (String s : senArray) {
            try{
                Integer i = Integer.parseInt(s);
                intCounter++;
            }catch(Exception e){
                try{
                Double d = Double.parseDouble(s);
                dblCounter++;
                }catch(Exception e1){
                    if(!s.isEmpty()) strCounter++;
                }
            }
        }
        System.out.println("string " + strCounter);
        System.out.println("integer " + intCounter);
        System.out.println("double " + dblCounter);
    }
	
}
