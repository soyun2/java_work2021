
public class Pro13_1 {
	
	public static int minValue(int[] arr){
		int min = arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){	
				min = arr[i];
			}
		}
		return min;
	}
	public static int maxValue(int[] arr){
		int max = arr[0];
		for(int e:arr){
			if(max<e){	
				max = e;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(minValue(arr));
		System.out.println(maxValue(arr));
	}
}
