/*
 * p.135 > 문제 05-7. 1)
 */

public class T01 {
	
	public static void main(String[] args) {
		
		int result = 0;
		
		for (int j = 2; j < 9; ) {
			
			System.out.println("-------" + j + "단");
			
			for (int i = 1; i < j+1; i++) {
				
				result = j * i;
				System.out.println(j + "*" + i + "=" + result);
				
			}
				
			j = j + 2;
			
		}		
		
	}

}
