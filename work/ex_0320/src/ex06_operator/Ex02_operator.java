package ex06_operator;

import java.util.Scanner;

public class Ex02_operator {
	public static void main(String[] args) {
		
		//오버플로우 발생
		int result = 1000000 * 1000000;
		System.out.println(result);
		
		//산술 변환
		//기본적으로 이항 연산자의 연산은 두 피연산자의
		//타입이 일치해야 연산이 가능하다
		
		//컴퓨터는 서로 다른 타입을 계산하지 못하므로 값의 손실이 적은 쪽으로 타입을 맞춰준다
		//크기가 크거나 더 정밀한 쪽으로 
		//long + int -> long
		
		//복합대입연산자
		//산술연산자와 대입연산자가 합쳐진 상태
		
		int x = 10, y = 1;
		y += x;
		System.out.println(y); //11
		y *= x;
		System.out.println(y); //110
		// 코드가 위에서 아래로 반영되기 때문!
		
		//++x -> x+=1
		
		//비교연산자
		//변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		//결과가 항상 true나 false로 반환된다.
		
		//논리연산자
		//&&(and) -> 앞 뒤 피연산자가 둘 다 참이여야 참을 반환한다
		//||(or) -> 앞 뒤 피연산자 중 하나라도 참이면 참을 반환한다
		
		
		
	}
}
