package swAcademy_D1toD2_part2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class s_1961 {

	public static int turn(int[][] arr, int a) {

		String [][] ans = new String [a][3];

		for (int i = 0; i < a; i++) {
			StringBuffer st = new StringBuffer();
			for (int j = a - 1; j >= 0; j--) {
				st.append(arr[j][i]);
			}
			ans[i][0] = st.toString();
		}
		
		for (int i = a -1; i >=0 ; i--) {
			StringBuffer st = new StringBuffer();
			for (int j = a - 1; j >= 0; j--) {
				st.append(arr[i][j]);
			}
			ans[a-i-1][1] = st.toString();
		}
		
		for (int i = a -1; i >=0 ; i--) {
			StringBuffer st = new StringBuffer();
			for (int j = 0; j <a; j++) {
				st.append(arr[j][i]);
			}
			ans[a-i-1][2] = st.toString();
		}
		

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(ans[i][j] + " ");
				}
			System.out.println();
		}
		
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;
        
		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());

			int[][] map = new int[N][N];

			// map input
			for (int i = 0; i < N; i++) {
				String[] row = br.readLine().split(" "); // 한 줄을 입력해준다.
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(row[j]); // 한 줄을 Int형으로 바꾸고 입력.
				} // for(j) end
			} // for(i) end

            System.out.printf("#%d\n", num++);
			turn(map, N);
		}

	}
}
