package polymorphismDemo;

public class MethodOverriding {
	
	public static void main(String[] args){ 
        
		// If a Parent type reference refers to a Parent object, then Parent's show is called 
        
		Parent obj1 = new Parent();
		
        obj1.show(); 
        
        // If a Child type reference refers to a Child object, then Child's show is called 
        
     	Child obj2 = new Child();
     		
        obj2.show();
  
        // If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME POLYMORPHISM / METHOD OVERRIDING 
        
        Parent obj3 = new Child();
        
        obj3.show();
        
    }

}
