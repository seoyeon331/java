package ex02_switch;

public class Ex03_switch {
	public static void main(String[] args) {
		//자바 12이상으로 업데이트 되면서 switch의 문법이 새롭게 만들어졌다.
		//조건절에 복수개의 값을 사용하는 것이 가능해짐
		//화살표 표현식 가능
		//기존 switch문과 달리 case에 해당하는 절만 실행되고, 그 이후 case들은 실행되지 않는다.
		//자바 12 이상에서는 switch문에 break를 사용할 필요가 없다!!!
		
		String day = "MONDAY";
		
		switch(day) {
		case "MONDAY", "TUESDAY", "WENDSDAY", "THURSDAY", "FRIDAY" -> System.out.println("평일");
		case "SATURDAY","SUNDAY" -> System.out.println("주말");
		default -> System.out.println("잘못된 입력입니다.");
		
		}
	}
}
	
