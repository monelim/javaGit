
public class Ex04 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		String c = ""; // 빈 공간으로 초기화
		
		c = a > b ? "a가 큽니다" : "b가 큽니다";
		
		System.out.println("c = " + c);
		
//		System.out.println("c = " + (a > b ? "a가 큽니다" : "b가 큽니다")); 위 3줄(8 ~ 12)을 한 줄로 요약
		
		int d = a > b ? 1 : 0;
		
		System.out.println("d = " + d);
	}

}
