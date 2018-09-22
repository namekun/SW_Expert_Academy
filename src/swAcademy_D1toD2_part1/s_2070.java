package swAcademy_D1toD2_part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s_2070 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;

		while (T-- > 0) {
			System.out.printf("#%d ", num++);
			String[] nums = br.readLine().split(" ");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			if (a == b) {
				System.out.println("=");
			} else if (a > b) {
				System.out.println(">");
			} else {
				System.out.println("<");
			}
		}
	}
}
