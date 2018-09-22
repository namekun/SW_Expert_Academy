package swAcademy_D1toD2_part1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class s_2047 {

	public static void main(String[] args) throws IOException, NumberFormatException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] head = br.readLine().split("");
		
		for(int i =0; i<head.length; i++) {
			head[i] = head[i].toUpperCase();
			System.out.print(head[i]);
		}	
	}
}
