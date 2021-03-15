
public class Ex08 {

	Ex08(){
		int arr[][] = {
				{1},
				{22,33},
				{444,555,666}
		};
		for(int k[] : arr){
			for(int e : k){
				System.out.println(e+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Ex08();
	}
}
