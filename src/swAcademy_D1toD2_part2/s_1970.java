package swAcademy_D1toD2_part2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class s_1970 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;

		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());

			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			int f = 0;
			int g = 0;
			int h = 0;

			if (N >= 50000) {
				a = (N / 50000);
				N = N % 50000;
			}
			if (N >= 10000) {
				b = (N / 10000);
				N = N % 10000;
			}
			if (N >= 5000) {
				c = (N / 5000);
				N = N % 5000;
			}
			if (N >= 1000) {
				d = (N / 1000);
				N = N % 1000;
			}
			if (N >= 500) {
				e = (N / 500);
				N = N % 500;
			}
			if (N >= 100) {
				f = (N / 100);
				N = N % 100;
				System.out.println(N);
			}
			if (N >= 50) {
				g = (N / 50);
				N = N % 50;
				System.out.println(N);
			}
			if (N >= 10) {
				h = (N / 10);
				N = N % 10;
				System.out.println(N);
			}

			System.out.printf("#%d\n", num++);
			System.out.printf("%d %d %d %d %d %d %d %d\n", a, b, c, d, e, f, g, h);
		}

	}
}
