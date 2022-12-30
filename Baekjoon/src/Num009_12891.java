import java.util.Scanner;

public class Num009_12891 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int count = 0;
		
		String dna = sc.next();
		
		int store[] = new int[26];
		
		store[0] = sc.nextInt();
		store[2] = sc.nextInt();
		store[6] = sc.nextInt();
		store[19] = sc.nextInt();
		
		
		for(int i = 0; i < N; i++) {
			store[dna.charAt(i)-'A']--;
		}
		
		if(!(store[0] > 0 || store[2] > 0 || store[6] > 0 || store[19] > 0)) {
			++count;
		}
		
		int start = 0;
		int end = N;
		
		while(end < M) {
			store[dna.charAt(start++)- 'A']++;
			store[dna.charAt(end++) - 'A']--;
			
				if(!(store[0] > 0 || store[2] > 0 || store[6] > 0 || store[19] > 0)) {
					++count;
			}
				
		}
		
		System.out.print(count);
	}

}
