package swAcademy_D1toD2_part2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class s_1989 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int num = 1;
		boolean flag = false;

		while (T-- > 0) {
			System.out.printf("#%d ", num++);
			String[] pallindrom = br.readLine().split("");
			for (int i = 0; i < pallindrom.length; i++) {
				if (!pallindrom[i].equals(pallindrom[pallindrom.length - i - 1])) {
					flag = false;
				} else
					flag = true;
			}
			if (flag)
				System.out.println("1");
			else
				System.out.println("0");
		}

	}

}
