package swAcademy_D1toD2_part2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class s_1959 {

	public static int compare(int[] big, int[] small) {
		int max = 0;
		for (int i = 0; i < big.length - small.length + 1; i++) {
			int sum = 0;
			for (int j = 0; j < small.length; j++) {
				sum += (big[j + i] * small[j]);
			}
			max = Math.max(max, sum);
		}
		return max;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;

		while (T-- > 0) {

			String[] nm = br.readLine().split(" ");
			int max = 0;

			int n = Integer.parseInt(nm[0]);
			int m = Integer.parseInt(nm[1]);

			int[] N = new int[n];
			int[] M = new int[m];

			String[] stN = br.readLine().split(" ");
			String[] stM = br.readLine().split(" ");

			for (int i = 0; i < stN.length; i++) {
				N[i] = Integer.parseInt(stN[i]);
			}
			for (int i = 0; i < stM.length; i++) {
				M[i] = Integer.parseInt(stM[i]);
			}

			if (n > m) {
				max = compare(N, M);
			} else {
				max = compare(M, N);
			}
			System.out.printf("#%d %d\n", num++, max);
		}
	}
}
