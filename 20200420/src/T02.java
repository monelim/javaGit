/*
 * p.135 > 문제 05-7. 2)
 */

public class T02 {
	
	public static void main(String[] args) {
		
		int result = 0;
		
		for(int i = 1; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				
				int m = (10 * i) + j;
				int n = (10 * j) + i;
				result = m + n;
				
				if(result == 99)
					
					System.out.println("A B + B A = " + m + " + " + n + " = " + result);				
			}
		}
	}

}
