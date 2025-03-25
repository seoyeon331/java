package ex04_while;

import java.util.Random;
import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		// 몇번 반복해야 하는지 모를 때 좋다
			
	

		//반복횟수가 정해져있지 않을 때
		Random rnd = new Random();
		int random = rnd.nextInt(10)+1; // 1~10 사이의 난수
		
		Scanner sc = new Scanner(System.in);
		
		boolean isAnswer = true;
		
		while(isAnswer) {
			System.out.println("정답 : ");
			int answer = sc.nextInt();
			if(answer == random) {
				System.out.println("정답입니다!");
				isAnswer = false;
			}		
		}
		
		//int타입 변수num에 정수를 입력 받고
		//각 자리수의 합을 더한 결과를 출력
		
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();	
		int sum = 0;
        
        // num이 0이 될 때까지 각 자릿수 더하기
        while (num != 0) {
            sum += num % 10; // 일의 자릿수를 더함
            num /= 10; // 10으로 나누어 한 자리를 삭제
        }
        System.out.println(sum);
		
		//num % 10을 사용하여 일의 자리를 추출하고, 이를 sum에 더해줍니다.
		//num /= 10을 사용하여 다음 자리를 처리할 수 있도록 num을 10으로 나누어 한 자리를 삭제합니다.
		
       
				
				
	}

}
