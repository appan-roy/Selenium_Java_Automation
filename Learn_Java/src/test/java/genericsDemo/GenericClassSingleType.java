package genericsDemo;

//A Simple Java program to show working of user defined
//Generic classes

//We use < > to specify Parameter type
class TestSingle<T> {
	
	// An object of type T is declared
	T obj;

	// constructor
	TestSingle(T obj) {
		this.obj = obj;
	} 

	public T getObject() {
		return this.obj;
	}
	
}

//Driver class to test above
class GenericClassSingleType {
	public static void main(String[] args) {
		// instance of Integer type
		TestSingle<Integer> iObj = new TestSingle<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		TestSingle<String> sObj = new TestSingle<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
	}
}
