package swAcademy_D1toD2_part1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class s_2058 {
	public static void main(String[]args) throws IOException, NumberFormatException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int sum = 0;
		 String [] number = br.readLine().split("");
		
		 for(String num : number) {
			 int a = Integer.parseInt(num);
			 sum += a;
		 }
		 
		 System.out.println(sum);
	}
}
