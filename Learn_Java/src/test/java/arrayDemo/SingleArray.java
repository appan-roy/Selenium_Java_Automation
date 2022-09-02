package arrayDemo;

public class SingleArray {

	public static void main(String[] args) {
		
		int marks[] = new int[5];
		
		marks[0] = 67;
		marks[1] = 45;
		marks[2] = 93;
		marks[3] = 79;
		marks[4] = 30;
		
		int total_students = marks.length;
		
		int i = 0;
		
		do{
			
			System.out.println("The student's mark is "+marks[i]);
			
			i++;
			
		} while(i < total_students);

	}

}
