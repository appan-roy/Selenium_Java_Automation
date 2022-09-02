package streamsDemo;

import java.util.ArrayList;
import java.util.List;

class Product {

	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class FilterDemo2 {

	public static void main(String[] args) {

		// Scenario: Print all the product names whose price are between 40000 & 50000
		List<Product> prodList = new ArrayList<Product>();

		prodList.add(new Product(101, "HP Laptop", 50000));
		prodList.add(new Product(101, "Lenovo Laptop", 45000));
		prodList.add(new Product(101, "Dell Laptop", 40000));
		prodList.add(new Product(101, "Asus Laptop", 30000));
		prodList.add(new Product(101, "MacBook", 100000));

		prodList.stream().filter(p -> p.price >= 40000 & p.price <= 50000).forEach(pr -> System.out.println(pr.name));

	}

}
