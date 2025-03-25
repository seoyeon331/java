package ex02_switch;

public class Ex02_switch {
	public static void main(String[] args) {
		//switch에 break가 없는 경우
		//모든 case가 다 실행된다.
		
		//int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		
		int x = 19;
		if(x > 10 && x < 20) {
			System.out.printf("%d가 10보다 크고 20보다 작습니다.\n", x);
		}
		
		//char형 변수 ch가 알파벳(대문자 또는 소문자)일때 true인 조건식
		
		char ch = 'c';
		
		if(ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90) {
		}
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
		}
		
	}
}
