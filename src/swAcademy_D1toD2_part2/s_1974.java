package swAcademy_D1toD2_part2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class s_1974 {

	public static int chkSudoku(int[][] arr) {

		int chk = 1;
		// 가로열 비교
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < 9; j++) {
				sum += arr[i][j];
			}
			if (sum != 45)
				chk = 0;
		}

		// 세로열 비교
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < 9; j++) {
				sum += arr[j][i];
			}
			if (sum != 45)
				chk = 0;
		}

		// 3 x 3 비교
		for (int i = 0; i < 9; i += 3) { // i는 3씩 증가해야만합니다.
			int sum = 0;
			for (int j = i; j < i + 3; j++) {
				for (int k = i; k < i + 3; k++) {
					sum += arr[j][k];
				}
			}
			if (sum != 45)
				chk = 0;
		}
		return chk;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;
		int[][] map = new int[9][9];

		while (T-- > 0) {
			// map input
			for (int i = 0; i < 9; i++) {
				String[] row = br.readLine().split(" "); // 한 줄을 입력해준다.
				for (int j = 0; j < 9; j++) {
					map[i][j] = Integer.parseInt(row[j]); // 한 줄을 Int형으로 바꾸고 입력.
				} // for(j) end
			} // for(i) end

			int ans = chkSudoku(map); // 스도쿠인지 확인해봅시다.

			System.out.printf("#%d %d\n", num++, ans);

		} // while end

	}

}
