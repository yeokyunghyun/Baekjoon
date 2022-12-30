import java.util.Scanner;
public class Num007_1940 {

	
	public static void mergeSort(int start, int end , int src[], int tmp[]) {
		
		if(start < end) {
			int mid = (start + end) / 2;
		mergeSort(start,mid, src,tmp);
		mergeSort(mid+1,end, src,tmp);
		
		int q = mid+1;
		int p = start;
		int init = p;
		
		while(init <= end) {
			
			if(q>end || (p<=mid && src[p] <= src[q])) {
				tmp[init++] = src[p++];
			}
			else {
				tmp[init++] = src[q++];
			}
		}
		
		for(int i = start; i <= end; i++) {
			src[i] = tmp[i];
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //재료의 갯수
		int M = sc.nextInt();
		
		int store[] = new int[N+1];
		int tmp[] = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			store[i] = sc.nextInt();
		}
		
		mergeSort(1,N,store,tmp);
		
		int start = 1;
		int end = N;
		int count = 0;
		
		while(start!=end) {
			
			if(store[start] + store[end] == M) {
				--end;
				++count;
			}
			
			else if(store[start] + store[end] < M) {
				++start;
			}
			else {
				--end;
			}
		}
		
		System.out.print(count);
	}
}


