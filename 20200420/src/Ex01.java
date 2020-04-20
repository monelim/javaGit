import java.util.Scanner;

/*
 *  
 * git 회원가입 
 * (구름 IDE - 설치없이 사용가능)
 * 
 * javac 명령어로 컴파일 하는 것
 * 이클립스를 사용하기 때문에 자동 컴파일 됨 * 
 * java Ex01.class
 * 
 * 디버그 모드)
 * debug 이클립스에서 사용하는 개발자 개발도구
 * F6 라인 진행
 * F8 디버그 모드 종료 or 다음 브레이크 포인트까지 진행
 * 
 */

public class Ex01 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		/*
		 * char a[30];
		 * fgets(a, stdin);
		 * 
		 * 
		 */
		
		System.out.println("입력하세요");
		Scanner scan = new Scanner(System.in);
		String inputValue = scan.nextLine();
		System.out.println("inputValue = " + inputValue);
		
	}

}
