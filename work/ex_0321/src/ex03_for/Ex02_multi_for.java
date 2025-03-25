package ex03_for;

public class Ex02_multi_for {
	public static void main(String[] args) {

		// A B C D
		// E F G H
		// I J K L
		
		char x = 'A';
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 4; j++) {
				
				System.out.print(x + " ");
				x++;
				
			}
			System.out.println();
		}
		
		//두 개의 주사위를 던졌을 대, 눈의 합이 6이되는
		//모든 경우의 수를 출력하는 프로그램을 작성하시오
		//1,5
		//2,4
		//3,3
		//4,2
		//5,1
		
		
		for(int i = 1; i <= 6 ; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i+j == 6) {
					System.out.printf("i, j = %d, %d\n", i, j);
				}	
			}	
		}
		
		
	
	
		
		
 }
}
