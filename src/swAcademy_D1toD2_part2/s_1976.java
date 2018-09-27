package swAcademy_D1toD2_part2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class s_1976 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;
		int TotHour = 0, TotMin = 0;

		while (T-- > 0) {
			String[] time = br.readLine().split(" ");

			int hour1 = Integer.parseInt(time[0]);
			int hour2 = Integer.parseInt(time[2]);
			int min1 = Integer.parseInt(time[1]);
			int min2 = Integer.parseInt(time[3]);

			TotHour = hour1 + hour2;
			TotMin = min1 + min2;

			if (TotMin >= 60) {
				TotMin -= 60;
				TotHour += 1;
			}
			if (TotHour > 12) {
				TotHour = TotHour - 12;
			}
			System.out.printf("#%d %d %d\n", num++, TotHour, TotMin);
		}

	}
}
