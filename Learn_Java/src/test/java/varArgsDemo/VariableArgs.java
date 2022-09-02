package varArgsDemo;

public class VariableArgs {

	public static void main(String[] args) {
		
		VariableArgs varArg = new VariableArgs();

        int sum2 = varArg.sumNumber(2, 4);
        System.out.println("sum2 = " + sum2);

        int sum3 = varArg.sumNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3);

        int sum4 = varArg.sumNumber(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);

	}
	
	public int sumNumber(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }

}
