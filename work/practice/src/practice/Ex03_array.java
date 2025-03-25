package practice;

public class Ex03_array {
	public static void main(String[] args) {
		
		//배열을 오름차순으로 정렬하기
		
		int[] arr = {5,4,3,2,1};
		
		//43215
		//32145
		//21345
		//12345
		
		for(int i = arr.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				int box = 0;
				if(arr[j] > arr[j+1]) {
					box = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = box;
				}
			}	
		}
//		4/0123
//		3/012
//		2/01
//		1/0
		
		
		
		
		
		
	}
}
