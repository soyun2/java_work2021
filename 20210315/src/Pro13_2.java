
public class Pro13_2 {
	public static void addOneDArr(int[] arr, int add){
		for(int i=0;i<arr.length;i++)
			arr[i] += add;
	}
	public static void addTwoDArr(int[][] arr, int add){
		for(int k[]:arr){
			addOneDArr(k,add);
		}
	}
	public static void main(String[] args) {
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		addTwoDArr(arr,1);
		for(int k[]:arr){
			for(int e:k){
				System.out.print(e+" ");
			}
			System.out.println();
		}
	}
	
}
