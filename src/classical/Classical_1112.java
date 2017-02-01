/**
 * created	:	31 Jan, 2016
 * submitted:	31 Jan, 2016
 */

package classical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Classical_1112 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter w = new PrintWriter(System.out, true);
		
		String s[] = new String[2];
		int m;
		int n;
		
		int i = Integer.parseInt(b.readLine());
		for (int j = 0; j < i; j++) {
			s = b.readLine().split(" ");
			m = Integer.parseInt(s[0]);
			n = Integer.parseInt(s[1]);
			
			if(m == n){
				if(m%2 == 0){
					if(m!=0)
						w.println(m*2);
					else
						w.println("0");
				} else {
					w.println(2*m-1);
				}
			} else if (m-n == 2){
				if(m%2 == 0){
					w.println(m+n);
				} else {
					w.println(n+m-1);
				}
			} else {
				w.println("No Number");
			}

		}
	}
}
