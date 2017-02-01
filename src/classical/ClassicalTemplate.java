package classical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ClassicalTemplate {
	
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

		}
	}

}
