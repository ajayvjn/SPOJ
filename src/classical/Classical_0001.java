/**
 * created	:	17 Jan, 2016
 * submitted:	17 Jan, 2016
 */

package classical;
/*TEST - Life, the Universe, and Everything

Your program is to use the brute-force approach in order to find 
the Answer to Life, the Universe, and Everything. 
More precisely... rewrite small numbers from input to output. 
Stop processing input after reading in the number 42. 
All numbers at input are integers of one or two digits.*/

import java.util.Scanner;

public class Classical_0001 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int i = 0;
		
		while((i=s.nextInt())>-1 && i != 42){
			System.out.println(i);
		}
		s.close();
	}

}
