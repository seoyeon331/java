package practice;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		//2차원 배열을 활용한 로또
		
		//당첨번호 리스트
		int[][] lotto = {{2,6,11,33,42,44},{1,6,17,22,24,33},{7,16,24,33,42,44},{11,27,32,34,43,46},{6,17,22,24,33,41}};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당첨 숫자를 6개 연속으로 입력해주세요 : "); //사용자로부터 숫자 받은 상태
		 
		int[] num = new int[6]; // 그 숫자를 담을 공간을 만들어 놓은 상태
		
		//이제 사용자로부터 받은 숫자를 읽어서, 내가 만들어놓은 공간에 넣어야지!
		//총 6개의 숫자이니까 총 6번 넣는 행위를 해야겠네 그러면 for문을 사용하자!
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		//그다음! 당첨번호 리스트랑 사용자로 부터 받은 숫자를 비교하자
		//당첨번호 리스트는 총 5개이다. 
		//첫번째 리스트부터 값을 하나씩 비교해야 한다. 중첩 for문을 사용하자!
		
		outer:for(int a = 0; a < lotto.length; a++) {  //첫번째 당첨 리스트 선택
			for(int b = 0; b < lotto[a].length; b++) {  //6개의 숫자 중 하나씩 선택
				
				//당첨여부를 판단할 변수 하나를 만들자
				 boolean result = true;
				
				//로또번호니까 하나라도 다르면 더 이상 비교할 필요가 없지, break;로 빠져나오도록 하자
				if(lotto[a][b] != num[b]) {
					result = false;
					System.out.println("틀렸습니다.");
					break outer;
				}
				
			}
			
		
			//당첨이라면 당첨사실을 알리고, 당첨 번호를 알려주자
//			if(result) {
//				System.out.println("당첨입니다!");
//				
//				for(int i = 0; i < num.length; i++) {
//					System.out.println(num[i]);
//				}
//				
//			}
			
			

			
			
		}
		
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
