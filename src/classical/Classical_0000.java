package classical;

import java.util.Scanner;

public class Classical_0000 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int totalInputs = s.nextInt();

		String st[] = null;
		int n[] = new int[7];
		int i = 0;
		int x_n = 0;
		int val = 0;
		int result = 0;

		while (totalInputs-- > 0) {
			n[0] = Integer.parseInt(s.next());
			st = s.nextLine().trim().split(" ");
			for (String a : st) {
				n[++i] = Integer.parseInt(a);
			}

			x_n = n[2] + n[3];
			for (i = n[2]; i <= x_n; i++) {
				val = n[0] * i + n[1] % n[6];
				if (val >= n[4] && val < n[5]) {
					result++;
				}
			}
			System.out.println(result);
			i = 0;
			result = 0;
		}
		s.close();
	}
}
