package java.collection.mapConcept;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map3 {

	public static void main(String[] args) {
		
		Map<String, String> hashmap = new HashMap<String, String>();
		
		hashmap.put("780", "Selenium");
		
		hashmap.put("376", "HP UFT");
		
		hashmap.put("485", "Appium");
		
		hashmap.put("234", "Jenkins");
		
		hashmap.put("107", "TestNG");
		
		hashmap.put("908", "Protractor");
		
		hashmap.put("843", "Maven");
		
		hashmap.put("675", "Cucumber");
		
		hashmap.put("555", "Sikuli");
		
		for(Map.Entry<String, String> data :hashmap.entrySet()){
			
			System.out.println("Key from map is "+data.getKey()+" and value is "+data.getValue());
			
		}

	}

}
