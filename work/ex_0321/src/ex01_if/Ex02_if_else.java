package ex01_if;

public class Ex02_if_else {
	public static void main(String[] args) {
		//조건이 거짓일때도 흐름을 제어하고 싶다면
		
		int num = 5;
		if(num > 4) {
			System.out.printf("%d은 4보다 큽니다.\n", num);
		}else {
			System.out.printf("%d은 4보다 작습니다.\n", num);
		}
		
		int a = 4;
		int b = 10;
		
		if(a > b) {
			System.out.println("a가 b보다 큽니다.");
		}else { // 이러면 a랑 b가 같은 경우도 들어가게됨
			System.out.println("a가 b보다 작습니다.");
		}
	}
}
