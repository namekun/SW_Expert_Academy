package swAcademy_D1toD2_part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s_1986 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;
		

		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int sum = 0;
			for (int i = 1; i <= N; i++) {
				if (i % 2 == 0) {
					sum -= i;
				} else
					sum += i;
			}
			System.out.printf("#%d %d\n", num++, sum);
		}
	}
}
