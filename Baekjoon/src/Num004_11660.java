import java.util.Scanner;

public class Num004_11660 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[][] = new int[N+1][N+1];
		int sum[][] = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				arr[i][j] = sc.nextInt();
				sum[i][j] = arr[i][j] + sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1];
			}
		}
		
		
		for(int i=0; i<M; i++) {
			int X1 = sc.nextInt();
			int Y1 = sc.nextInt();
			int X2 = sc.nextInt();
			int Y2 = sc.nextInt();
	
		
			System.out.println(sum[X2][Y2] - sum[X2][Y1-1] - sum[X1-1][Y2] + sum[X1-1][Y1-1]);
		}
	}
}
