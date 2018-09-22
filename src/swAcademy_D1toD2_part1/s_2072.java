package swAcademy_D1toD2_part1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class s_2072 {
	public static void main(String[]args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());		
		int num = 1;
		
		while(T-- > 0) {
			int sum = 0;
			int result = 0;
			System.out.printf("#%d ", num++);
			String [] nums = br.readLine().split(" "); // 입력받은것을 공백을 기준으로 잘라준다.
			for(String number : nums) {
				int tmp = Integer.parseInt(number);
                sum += tmp;
			}
			result = (int) Math.round(sum/10.0); // 10.0으로 나눠줘야 소수점아래를 구할 수 있습니다.
			System.out.println(result);
		}
		
		
	}
}
