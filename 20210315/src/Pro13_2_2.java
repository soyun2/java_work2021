
public class Pro13_2_2 {
	public static void changeRow(int[][] arr){
		int x = arr[0].length;
		int y = arr.length;
		
		int[][]brr = new int[x][y];
		for(int i=0; i<y; i++) {
            for(int j=0; j<x; j++) {
                brr[i][j] = arr[i][j];  
            }
        }
		
		for(int i=0; i<y; i++){
			for(int j=0; j<x; j++){
				if(i==0){
					arr[i][j] = brr[x-1][j];
				}
				else{
					arr[i][j] = brr[i-1][j];
				}
			}
		}
		
		for(int i=0; i<y; i++) {
            for(int j=0; j<x; j++) {
                System.out.print(arr[i][j]+"  ");  
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		changeRow(arr);
	}
}
