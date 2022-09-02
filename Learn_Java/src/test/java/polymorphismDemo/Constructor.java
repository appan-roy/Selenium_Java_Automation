package polymorphismDemo;

public class Constructor {
	
	double width, height, depth; 
	  
    // constructor used when all dimensions specified 
	
	Constructor(double w, double h, double d) 
    { 
        
		width = w; 
        height = h; 
        depth = d;
        
    } 
  
    // constructor used when no dimensions specified
	
	Constructor() 
    { 
        
		width = height = depth = 0;
		
    } 
  
    // constructor used when cube is created 
	
	Constructor(double len) 
    { 
        
		width = height = depth = len;
		
    } 
  
    // compute and return volume 
    
	double volume() 
    { 
        
		return width * height * depth;
		
    }

}
