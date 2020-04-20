import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		System.out.println("스위치 공부");
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt(); // 입력 받기를 기다린다.
		
		// ctrl + shift + f : 라인 자동정렬
		
		switch (input) {
		case 1:
			System.out.println("1 입력");
			break;
		case 2:
			System.out.println("2 입력");
			break;
		case 3:
			System.out.println("3 입력");
			break;
		default:
			System.out.println("잘못 입력 했습니다.");
			break;
		}
	}

}
