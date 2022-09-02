package finalizeDemo;

public class FinalizeConcept {

	public static void main(String[] args) {
		
		//creating two class objects
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		//removing the class reference from the objects
		f1 = null;
		f2 = null;
		
		//manually run garbage collector to cleanup the objects as they are not referring anything.
		//It is an automatic process but still manual run can be done. Before the garbage collector call,
		//finalize is called.
		System.gc();
		
	}

	//the console should print the below statements twice as before the gc this should be called and after
	//the main method its getting called again.
	public void finalize() {
		System.out.println("Finalize method");
	}
	
}
