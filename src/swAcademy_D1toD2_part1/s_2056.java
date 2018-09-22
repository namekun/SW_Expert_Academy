package swAcademy_D1toD2_part1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class s_2056 {
	public static void main(String[] args) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
		int T = Integer.parseInt(br.readLine());
		int[] mon_day ={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		while (T-- > 0) {
			System.out.printf("#%d ", num++);
			String date = br.readLine();
			String year = date.substring(0, 4); // substring(시작, 끝+1)
			String month = date.substring(4, 6);
			String day = date.substring(6, 8);
			
			if(Integer.parseInt(day) <= mon_day[Integer.parseInt(month)])
				System.out.printf("%s/%s/%s", year, month, day);
			else System.out.println("-1");
			
		} // while end
	}
}
