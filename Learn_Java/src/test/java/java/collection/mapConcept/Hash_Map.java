package java.collection.mapConcept;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		
		hashmap.put("780", "Selenium");
		
		hashmap.put("376", "HP UFT");
		
		hashmap.put("485", "Appium");
		
		hashmap.put("234", "Jenkins");
		
		hashmap.put("107", "TestNG");
		
		hashmap.put("908", "Protractor");
		
		hashmap.put("843", "Maven");
		
		hashmap.put("675", "Cucumber");
		
		hashmap.put("555", "Sikuli");
		
		System.out.println(hashmap);
		
		String str = hashmap.get("107");
		
		System.out.println("Value of key # 107 is "+str);

	}

}
