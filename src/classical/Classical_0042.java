/**
 * created	:	31 Jan, 2016
 * submitted:	31 Jan, 2016
 */

package classical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Classical_0042 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter w = new PrintWriter(System.out, true);
		
		String s[] = new String[2];
		int m = 1;
		int n = 1;
		
		int i = Integer.parseInt(b.readLine());
		for (int j = 0; j < i; j++) {
			s = b.readLine().split(" ");
			m = Integer.parseInt(s[0]);
			n = Integer.parseInt(s[1]);
			
			m = r(m) + r(n);
			w.println(r(m));
		}
	}

	private static int r(int i) {
		if(i == 0) return 0;
		int y = 0;
		while(i > 0){
			y = y*10 + (i%10);
			i/=10;
		}
		return y;
	}

}
