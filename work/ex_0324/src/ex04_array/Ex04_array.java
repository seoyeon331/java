package ex04_array;

public class Ex04_array {
	public static void main(String[] args) {
		
		//배열명에는 배열까지 접근할 수 있는 주소값이 들어가 있다
		
		int[] arr = null;
		
		//크기가 4인 정수형 배열
		int[] arr2 = new int[4]; //데이터가 안들어가 있음
		
		//identityHashCode -> 주소를 16진수로 표현해줌
		
		
		String s = "홍길동";
		//값을 직접 변수에 저장하는 것이 아니라 주소값이 저장되어
		//해당 주소를 통해 실제 주소에 접근하는 것을 참조변수라고 한다
		
		//배열의 특징
		//1. 배열 선언시 크기를 지정한다
		//2. 배열 선언 후 공간의 크기를 늘리거나 줄일 수 없다
		//3. 지정된 자료형의 값만 저장할 수 있다
		
		//배열에 각 방에 들어있는 데이터를 사용하는 법
		//배열명[index] -> 변수처럼 사용하면 된다
		//대입이 가능하다

		arr2[0] = 100;
		arr2[1] = 200;
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		//배열의 길이
		//배열은 내부적으로 length라는 변수를 지니는데
		//해당 변수는 배열의 길이 값을 가지고 있다
		//그래서 배열의 길이를 알고 싶을 때는 배열명.length
		//이 변수의 값은 배열이 생성될 때 지정되며 변경할 수 없다
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//배열의 초기값
		//배열은 생성과 동시에 데이터 자료형별로 기본값이 주어진다.
		//정수 -> 0
		//실수 -> 0.0
		//문자형 -> ''
        //객체형 -> null		
		
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		
		int[] varArray = {1,2,3,4,5};
		
		//intArray 의 첫번째 값 출력
		System.out.println(intArray[0]); //0
		System.out.println(strArray[0]); //null
		
		System.out.println(varArray[0]); //1
		System.out.println(varArray[1]); //2
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
