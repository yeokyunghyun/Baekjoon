import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Num024_2023 {
	
	static boolean eratos[];
	static int num;
	
	public static void main(String[] args)throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(bf.readLine());
		
		fillEratos();
		
		arr.add(1);
		arr.add(3);
		arr.add(7);
		arr.add(9);
		
		dfs(2,1);
		dfs(3,1);
		dfs(5,1);
		dfs(7,1);
		
	}
	
	public static void fillEratos() {
		
		int era = (int)(Math.pow(10.0, num));
		
		eratos = new boolean[era];
		
		for(int i = 0; i < era; ++i) eratos[i] = true;
		
		eratos[0] = eratos[1] = false;
		
		for(int i = 2; i*i < era; ++i) {
			if(!eratos[i]) continue;
			else {
				for(int j = i*i; j < era; j+=i) {
					if(eratos[j] == false) continue;
					else {
						eratos[j] = false;
					}
				}
			}
		}
	}
	//1,3,7,9만가능
	
	public static void dfs(int number, int digit) {
		
		if(digit == num) return;
		
		for(int i : arr) {
			
		}
		
	}
}
