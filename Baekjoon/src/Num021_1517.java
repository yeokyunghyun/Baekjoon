import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//bubbleSort에 관한 코드
public class Num021_1517 {
	
	public static int arr[];
	public static int tmp[];
	public static long count = 0;
	
	public static void main(String[] args)throws IOException {
		
		/*
		 버블소트문제지만 병합정렬을 이용해서 해결
		 병합정렬의 조건대로 n등분을 한뒤에 그게 그것이 뒤로갈경우에는 그 차이만큼 count를 올려준다.
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		
		arr = new int[num+1];
		tmp = new int[num+1];
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i = 1; i <= num; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//현재 배열에 전부 저장을 했고 mergeSort를 활용해서 분할해야됨.
		
		mergeSort(1,num);
		System.out.print(count);
	}
	
	public static void mergeSort(int start, int end) {
		
		if(start >= end) return;
		
		int mid = start + (end-start) / 2;
		mergeSort(start, mid);
		mergeSort(mid + 1, end);
		
		//분리하는 재귀함수까지 구현을 했고 이제 나눠져있는상태에서 p와 q를 사용해서 분배돼있는 각각의 배열에서 넣을때 그 차이를 확인하면서 차이만큼 count ++
		
		int p = start;
		int q = mid + 1;
		int idx = p;
		
		while(p <= mid && q <= end) {
			if(arr[p] < arr[q]) {
				if(idx < p) count += p - idx;
				tmp[idx++] = arr[p++];
			}
			else {
				if(idx < q) count += q - idx;
				tmp[idx++] = arr[q++];
			}
		}
		
		while(p <= mid) {
			if(idx < p) count += p - idx;
			tmp[idx++] = arr[p++];
		}
		
		while(q <= end) {
			if(idx < q) count += q - idx;
			tmp[idx++] = arr[q++];
		}
		
		for(int i = start; i <= end; ++i) {
			arr[i] = tmp[i];
		}
	}
}
