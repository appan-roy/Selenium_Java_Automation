package snippets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeSnippet7 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine();
		
		int l = Integer.parseInt(s.split("\\s")[0]);
		int b = Integer.parseInt(s.split("\\s")[1]);
		
		Rectangle rect = new Rectangle(l, b);
		rect.area();
		
	}

}

class Shape{
    
	int length, breadth;
    
    Shape(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    
    public void area(){
        System.out.println(this.length + " " + this.breadth);
    }
    
}

class Rectangle extends Shape {
    
	Rectangle(int l, int b) {
		super(l, b);
	}
    
    @Override
    public void area() {
    	super.area();
        System.out.println(length * breadth);
    }
    
}