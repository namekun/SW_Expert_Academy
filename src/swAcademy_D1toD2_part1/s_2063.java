package swAcademy_D1toD2_part1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;


public class s_2063 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		String[] nums = br.readLine().split(" ");

		int[] intnums = new int[N];
		
		for (int i = 0; i < intnums.length; i++) {
			intnums[i] = Integer.parseInt(nums[i]);
		}
		
		Arrays.sort(intnums);
		System.out.println(intnums[(N/2)]);
	}
}
