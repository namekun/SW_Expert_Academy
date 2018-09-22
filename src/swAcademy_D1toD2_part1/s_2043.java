package swAcademy_D1toD2_part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class s_2043 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String [] nums = br.readLine().split(" ");
		int cnt = 1;
		int ans = Integer.parseInt(nums[0]);
		int input = Integer.parseInt(nums[1]);
		
		
		while(ans != input) {
				input++;
				cnt++;
		}
		System.out.println(cnt);	
	}	
}
