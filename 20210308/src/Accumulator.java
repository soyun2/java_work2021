
public class Accumulator {
	static int sum;
	public static void add(int num){
		sum+=num;
	}
	public static void showResult(){
		System.out.println("sum = "+sum);
	}
	public static void main(String[] args) {
		for(int i=0; i<10; i++)
			Accumulator.add(i);
		Accumulator.showResult();
	}
}
