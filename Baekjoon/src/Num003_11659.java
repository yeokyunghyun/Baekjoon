import java.util.Scanner;

public class Num003_11659 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int[N+1];
		int sum[] = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			arr[i] = sc.nextInt();
			sum[i] = sum[i-1]+arr[i];
		}
		
		for(int i=0; i<M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			System.out.println(sum[end] - sum[start-1]);
		}
	}

}
