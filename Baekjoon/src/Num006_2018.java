import java.util.Scanner;

public class Num006_2018 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int start = 1;
		int end = 1;
		int sum = 1;
		int count = 1;
		
		while(end != num) {
			
			if(sum == num) {
				++end;
				sum += end;
				++count;
			}
			
			else if(sum > num) {
				sum -= start;
				++start;
			}
			
			else {
				++end;
				sum += end;
			}
		}
		
		System.out.print(count);
	}
}
