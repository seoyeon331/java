package ex01_if;

import java.util.Scanner;

public class Ex01_if {

	public static void main(String[] args) {
		//만약 실행해야 하는 명령이 하나라면 중괄호를 생략할 수 있다
		//중괄호를 사용할 때는 들여쓰기를 하는 것이 좋다
		int result = 0;
		
		if(3>2){
			result = 3;
		}
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이입력: ");
		int age = sc.nextInt();
		
		if(age>19) {
			System.out.println("성인입니다.");
		}
		System.out.println("프로그램을 종료합니다.");
		

	}

}
