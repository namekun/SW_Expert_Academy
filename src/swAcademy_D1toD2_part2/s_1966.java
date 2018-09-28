package swAcademy_D1toD2_part2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class s_1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;

		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());

			String[] arr = br.readLine().split(" ");

			int[] arr1 = new int[N];

			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = Integer.parseInt(arr[i]);
			}

			Arrays.sort(arr1);

			System.out.printf("#%d ", num++);
			for (int a : arr1) {
				System.out.printf("%d ", a);
			}
			System.out.printf("\n");
		}

	}
}
