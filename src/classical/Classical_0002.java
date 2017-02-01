/**
 * created	:	23 Jan, 2016
 * submitted:	31 Jan, 2016
 */

package classical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Classical_0002 {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter w = new PrintWriter(System.out, true);
		
		String s[] = new String[2];
		int m = 1;
		int n = 1;
		int c = 0;
		
		int i = Integer.parseInt(b.readLine());
		for (int j = 0; j < i; j++) {
			s = b.readLine().split(" ");
			m = Integer.parseInt(s[0]);
			n = Integer.parseInt(s[1]);
			while (m <= n) {
				if(m%2 != 0)
				{
					if(m == 1){
						m++;
						continue;
					}
					for (int l = 3; l*l <= m; l+=2) {
						if(m%l == 0){
							c++;
							break;
						}
					}
					if(c == 0){
						w.println(m);
					}
					c = 0;
					m+=2;
				}
				else if(m == 2) {
					w.println(m);
					m++;
				} else {
					m++;
				}
			}
			w.println();
		}
	}
}