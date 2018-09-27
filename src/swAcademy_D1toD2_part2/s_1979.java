package swAcademy_D1toD2_part2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class s_1979 {

	public static int cntWord(int[][] arr, int n, int k) {

		int cntWord = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 1) {
					
					// 가로 계산.
					int cnt = 0;
					for (int x = j; x < n; x++) {
						// 만약 첫 번째 행이라면
						if (j == 0) {
							if(arr[i][x]==1) cnt++; // 1이라면 더해줍니다.
							else break;	
						}
						// 첫 번째 항이 아니라면,
						else {
							// 해당하는 배열이 1이고, 
							if(arr[i][x]==1 && arr[i][j-1]==0) 	cnt++;
							else break;
						}
					}
					// 만약 그 길이가 똑같다면, 개수로 쳐줍니다.
					if (cnt == k) cntWord++;
					
					
					// 세로 계산
					cnt = 0;
					
					for(int y = i; y < n; y ++) {
						// 만약 첫 번째 행이라면
						if(i == 0) {
							if(arr[y][j]==1) { 
								cnt ++; 
							} else break;
						// 	
						}else {
							if(arr[i-1][j] == 0 && arr[y][j]==1) cnt++;
							else break;
						}
					}
					
					// 똑같게 합니다.
					if(cnt == k) {
						cntWord++;
					}
				}
			}
		}

		return cntWord;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;

		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = 0;

			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			int[][] map = new int[N][N];

			for (int i = 0; i < N; i++) {
				StringTokenizer nums = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(nums.nextToken());
				}
			}
			
			cnt = cntWord(map, N, K);
			
			
			System.out.printf("#%d %d\n", num++, cnt);
		}
	}
}
