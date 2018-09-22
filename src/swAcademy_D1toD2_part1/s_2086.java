package swAcademy_D1toD2_part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s_2086 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;

		while (T-- > 0) {
			System.out.printf("#%d ", num++);
			int[] nums = new int[10];
			String[] origin = br.readLine().split(" ");
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(origin[i]);
			}
			for(int j = 0; j<nums.length-1; j++) {
				if(nums[j+1] < nums[j]) {
				int tmp = nums[j+1];
				nums[j+1] = nums[j];
				nums[j] = tmp;
				}
			}
			System.out.println(nums[9]);	
		}

	}
}
