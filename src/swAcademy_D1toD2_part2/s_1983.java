package swAcademy_D1toD2_part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class s_1983 {
	public static void main(String[] args) throws IOException {

		String[] Result = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		int num = 1;

		while (T-- > 0) {
			ArrayList<Double> arr = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());

			int stuNum = Integer.parseInt(st.nextToken());
			int wntNum = Integer.parseInt(st.nextToken());
			double targetVal = 0.0;

			for (int i = 0; i < stuNum; i++) {
				StringTokenizer test = new StringTokenizer(br.readLine());
				double a = Integer.parseInt(test.nextToken());
				double b = Integer.parseInt(test.nextToken());
				double c = Integer.parseInt(test.nextToken());

				arr.add(0.35 * a + 0.45 * b + 0.20 * c);

				if (i == wntNum - 1) {
					targetVal = arr.get(i);
				}
			}

			Collections.sort(arr);

			int rank = 0;

			for (int i = 0; i < stuNum; i++) { 
				if (arr.get(i) == targetVal) {
					rank = stuNum - i - 1;
					break;
				}
			}
			// rank가 10이상이 되면, 구간 별로 점수를 줘야하기 때문에 이렇게 나누고 버림함수로 점수를 판단해준다.
			System.out.printf("#%d %s\n", num++, Result[(int)Math.floor((double)rank/stuNum * 10)]); 
		}
	}
}
