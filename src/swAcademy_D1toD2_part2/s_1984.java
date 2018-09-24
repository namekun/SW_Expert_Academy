package swAcademy_D1toD2_part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class s_1984 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;

		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>();

			double sum = 0;
			double avg = 0;

			for (int i = 0; i < 10; i++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}

			Collections.sort(arr);

			for (int k = 1; k < 9; k++) {
				sum += arr.get(k);
			}

			avg = Math.round(sum / 8);

			System.out.printf("#%d %.0f\n", num++, avg);
		}

	}
}
