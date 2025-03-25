package ex04_while;

import java.util.Scanner;

public abstract class Ex02_do_while {
	public static void main(String[] args) {
		// 조건식의 결과와 상관없이 무조건 한 번은 실행한다.
		
		int i = 11;
		do {
			System.out.println(i);
		}while(i <= 10);
		
		// 1~10 총합
		
		i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		}while(i <= 10);
		System.out.println(sum);
		
		//비밀번호 확인 프로그램 만들기
		//사용자로 부터 비밀번호를 입력받아 올바른 비밀번호가 입력될때까지 입력을 요구하는 프로그램
		//비밀번호 9486
		
		Scanner sc = new Scanner(System.in);
		
		//1번째 방법
		int a = 9486;
		boolean result = true; 

		do {
			System.out.print("비밀번호를 입력하세요 : ");
			int pw = sc.nextInt();
			if(pw == a) { 
				System.out.println("비밀번호가 맞습니다.");
				result = false;
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
		}while(result);
		
		//2번째 방법
		result = false; 
		
		do {
			System.out.print("비밀번호를 입력하세요 : ");
			int pw = sc.nextInt();
			if(pw == a) { 
				System.out.println("비밀번호가 맞습니다.");
				result = true;
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
		}while(!result);
		
		//3번째 방법
		int answer = 9486;
		int pw; //while조건문 안에서 이 변수를 써야하므로 do문 밖에서 선언해야 된다(변수의 유효범위)

		do {
			System.out.print("비밀번호를 입력하세요 : ");
			pw = sc.nextInt();
			if(pw == answer) { 
				System.out.println("비밀번호가 맞습니다.");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
		}while(pw != answer);
		
		
		//학생의 국어, 영어, 수학 점수를 입력
		//단, 각 과목은 40점 이상
		//40점 미만이면 해당 과목 점수를 다시 입력받아야 한다
		
		boolean num = true; 
		
		do {
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			
			boolean result1 = kor >= 40;
			boolean result2 = eng >= 40;
			boolean result3 = math >= 40;
			
			if(result1 && result2 && result3) {
				num = false; 
				System.out.println("모든 과목은 40점 이상입니다.");
			}
			
		}while(num);
		
		
		
		 
		
		
		
		
		
		
		
		
		
	}
}
