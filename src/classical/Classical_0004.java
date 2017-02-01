/**
 * created	:	31 Jan, 2016
 * submitted:	31 Jan, 2016
 */

package classical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Classical_0004 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter w = new PrintWriter(System.out, true);
		
		String s = "";
		char c;
		String t = "";
		String u = "";
		List<String> a = new ArrayList<String>();
		
		int i = Integer.parseInt(b.readLine());
		for (int j = 0; j < i; j++) {
			s = b.readLine();
			for (int k = 0; k < s.length(); k++) {
				c = s.charAt(k);
				a.add(String.valueOf(c));
				if(c == ')'){
					for(int l = a.size()-1; l >= 0; l--){
						u = a.get(l);
						if(!(u.equals("(") || u.equals(")"))){
							if(u.equals("+") || u.equals("-") || u.equals("/") || u.equals("*") || u.equals("^")){
								t+=u;
							} else {
								t=u+t;
							}
						}
						a.remove(l);
						if(u.equals("(")){
							a.add(t);
							break;
						}
					}
					t="";
				}
				
			}
			w.println(a.get(0));
			a.clear();
		}
	}

}
