package ex01_if;

public class Ex03_if_elseif_else {
	public static void main(String[] args) {
		//if문 안에 두개이상의 조건식과 논리연산자를 사용할수도 있지만
		//더욱 코드를 간결하게 하고 가독성을 높이기 위한 방법이다
		//else if 문의 개수에는 제한이 없다
		//하지만 너무 많은 else if문을 사용하면 
		//프로그램의 실행 속도가 현저히 느려질 수 있기 때문에
		//다른 방법을 함께 고려해야 한다
		//else문은 필요없다면 생략이 가능하다
		
		int favorite = 7;
		if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		} else if(favorite == 7) {
			System.out.println("좋아하는 숫자는 7입니다."); // 숫자가 7이라면 이 조건이 좀 더 맞는 조건임
		} 
		//효율적인 흐름으로 제어하기 위해 조건문의 위치를 잘 고려해야 한다
		
		
	}
}
