package swAcademy_D1toD2_part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s_2005 {

	public static void main(String[] args) throws IOException {
		// 파스칼의 삼각형

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testcase = Integer.parseInt(br.readLine());

		for (int t = 0; t < testcase; t++) {
			int n = Integer.parseInt(br.readLine());
			if (n >= 1 && n <= 10) {
				int[][] a = new int[n][n];
				a[0][0] = 1;

				for (int i = 1; i < n; i++) {
					a[0][1] = 0;
					a[i][0] = 1;

					for (int j = 1; j < n; j++) {

						a[i][j] = a[i - 1][j - 1] + a[i - 1][j];

					}
				} // pascal 규칙

				System.out.printf("#%d\n", t + 1);

				for (int i = 0; i < n; i++) {

					for (int j = 0; j < n; j++) {

						if (a[i][j] != 0) {
							System.out.print(a[i][j] + " ");
						}
					}
					System.out.println();
				}

			}
		}

	}// main

}// class
