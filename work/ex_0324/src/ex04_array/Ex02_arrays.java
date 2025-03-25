package ex04_array;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02_arrays {
	public static void main(String[] args) {
		//Arrays클래스는 배열의 복사, 항목의 정렬, 항목 검색 등
		//배열을 다루기 위한 다양한 메서드를 제공한다.
		//Arrays클래스를 이용하면 배열의 기능을 더욱 쉽게
		//사용할 수 있다
		
		//Scanner, Random 클래스의 경우
		//객체를 먼저 생성하고 메서드 사용
		
		//Arrays.함수명()로 작성하여 기능을 호출
		
		//1. 배열의 출력
		//toString()
        //반복문의 도움 없이 배열 출력 가능	
		
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		
		//2. 배열의 정렬
		//sort()
		//기본적으로 오름차순 정렬
		Arrays.sort(arr); //반환값이 없음
		System.out.println(Arrays.toString(arr));
		
//		Comparator.reverseOrder()를 통해서 내림차순으로 정렬이 가능하다.
//		하지만 기본자료형 배열로는 불가능하다.
//		기본자료형의 클래스타입이 필요한데 이를 Wrapper클래스 라고 한다.
		
		//int -> Integer
		
		Integer[] arr2 = {1,2,3,4,5,6,7,8};
		
		Arrays.sort(arr2, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		//배열의 복사
		//자바에서 배열은 한번 생성하면 그 길이를 변경할 수 없다
		//따라서 더 많은 데이터를 저장하거나 기존의 배열과 똑같은
		//배열을 새로 만드려면 배열을 복사해야 한다.
		//배열을 복사하는 방법에는 얕은 복사와 깊은 복사가 있다
		
		//얕은복사 : 복사된 배열이나 원본 배열이 변경될 때 
		//서로 간의 값이 함께 변경
		//주소값을 복사한다!
	
		int[] arr01 = {1,2,3};
		int[] arr02 = arr01;
		//arr01과 arr02는 같은 주소값을 참조한다
		
		arr02[1] = 10;
		//즉, arr01[1]을 변경하면 arr02[1]도 바뀐다.
		
		//깊은복사 : 복사된 배열이나 원본 배열이 변경될 때
		//서로 간의 값은 바뀌지 않는다
		//반복문을 이용하거나, Arrays클래스, System 클래스 기능을 이용한다.
		//값을 복사한다!
		
		int [] cards = {1,6,4,5,3,2};
		int [] newCards = new int[cards.length];
		
		//Arrays클래스를 이용한 깊은복사
		int[] newCards2 = Arrays.copyOf(cards, cards.length);
		
		//반복문을 이용한 깊은복사
		for(int i = 0; i < cards.length; i++) {
			newCards[i] = cards[i];
		}
		
		//System클래스를 이용한 깊은 복사
		int[] newCards3 = new int[cards.length];
		
		System.arraycopy(cards, 0, newCards3, 0, cards.length);
		
		newCards[1] = 100;
		System.out.println(Arrays.toString(newCards));
		System.out.println(Arrays.toString(newCards2));
		System.out.println(Arrays.toString(newCards3));
		
		//다차원 배열
		//2차원 이상의 배열을 의미하며, 배열의 요소로 또 다른 배열을 가지는 것을 의미
		//2차원배열은 요소로서 1차원배열을 가진다
		
//		int[][] arr = new int[2차원배열의 크기][1차원배열의 크기];
		
		//가능
		//요소로 들어가는 1차원의 배열의 크기를 지정하지 않고 생성가능
		int[][] arr3 = new int[3][];
		
		//불가능
//		int[][] arr3 = new int[][3];
		
		arr3[0] = new int[2];
		arr3[1] = new int[3];
		arr3[2] = new int[1];
	}
}
