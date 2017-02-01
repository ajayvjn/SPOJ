/**
 * created	:	21 Feb, 2016
 * submitted:	21 Feb, 2016
 */

package classical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Classical_3410 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter w = new PrintWriter(System.out, true);
		int m = Integer.parseInt(b.readLine());
		
		while (m!=0){
			w.println((m*(m+1)*(2*m+1))/6);
			m = Integer.parseInt(b.readLine());
		}
	}
}
