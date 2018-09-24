package swAcademy_D1toD2_part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s_2007 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;
		int ans;

		while (T-- > 0) {

			String sent = br.readLine();
			String a, b;
			ans = 1;

			while (true) {

				a = sent.substring(0, ans);
				b = sent.substring(ans, ans + ans);

				if (a.equals(b)) {
					break;
				} else {
					ans++;
				}
			}

			System.out.printf("#%d %d\n", num++, ans);
		}

	}

}
