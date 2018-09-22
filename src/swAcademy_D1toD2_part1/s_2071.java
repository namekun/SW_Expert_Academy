package swAcademy_D1toD2_part1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class s_2071 {
	public static void main(System [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());		
		int num = 1;
		
		while(T-- > 0) {
			int sum = 0;
			System.out.printf("#%d", num++);
			String [] nums = br.readLine().split(" "); // 입력받은것을 공백을 기준으로 잘라준다.
			for(String number : nums) {
				int tmp = Integer.parseInt(number);
				if(tmp%2==1) sum += tmp;
			}
			System.out.println(sum);
		}
		
		
	}
}
