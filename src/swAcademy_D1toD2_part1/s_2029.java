package swAcademy_D1toD2_part1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class s_2029 {
	public static void main(String[]args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int num = 1;
		
		while(T-->0) {
			System.out.printf("#%d " , num++);
			String [] nums = br.readLine().split(" ");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			
			int c = a / b;
			int d = a % b;
			
			System.out.println(c + " " + d);
			
		}
		
		
	}
}
