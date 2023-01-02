import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//병합정렬관련문제
public class Num020_2751 {
	
	static int arr[];
	static int tmp[];
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(bf.readLine());
		
		arr = new int[num];
		tmp = new int[num];
		
		for(int i = 0; i < num; ++i) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		
		quick(0,num-1);
		
		for(int i = 0; i < num; ++i) {
			bw.write(arr[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static void quick(int start, int end) {
		
		if(start >= end) return;
		
		int mid = start + (end-start) / 2;
		
		int p = start;
		int q = mid + 1;
		int idx = start;
		
		quick(p , mid);
		quick(mid + 1, end);
		
		while(p <= mid && q <= end) {
			
			if(arr[p] < arr[q]) {
				tmp[idx++] = arr[p++];
			}
			else {
				tmp[idx++] = arr[q++];
			}
		}
		
		while(p <= mid) {
			tmp[idx++] = arr[p++];
		}
		
		while(q <= end) {
			tmp[idx++] = arr[q++];
		}
		
		for(int i = start; i <= end; ++i) {
			arr[i] = tmp[i];
		}
	}
}
