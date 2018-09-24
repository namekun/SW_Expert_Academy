package swAcademy_D1toD2_part2;


// 참고한 것 : http://meansoup.blogspot.com/2017/09/blog-post.html


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class s_2001 {

	static int max = 0;
	static int n;
	static int m;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;

		while (T-- > 0) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = 0;
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());

			int[][] map = new int[n][n];
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			} // map을 만들어준다.

			int number = n - m + 1; 
			for (int i = 0; i < number; i++) {
				for (int j = 0; j < number; j++) {
					int tmp = sum(map, i, j);
					if (tmp > max)
						max = tmp;
				}
			}
			System.out.printf("#%d %d\n", num++, max);

			max = 0;

		}
		br.close();
	}

	public static int sum(int[][] a, int i, int j) {
		int sum = 0;

		for (int k = i; k < m + i; k++) {
			for (int z = j; z < m + j; z++) {
				sum = sum + a[k][z]; 
			}
		}

		return sum;

	}
}