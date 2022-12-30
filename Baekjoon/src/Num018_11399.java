import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//삽입정렬을 이용하여 정렬을 하되, 그전에 배열들이 이진탐색이 가능하도록 정렬돼있기때문에 이진탐색을 이용해서 인덱스위치 호출
//return lo 를 통해서 삽입할위치를 알고, 그위치에있는 다른 배열값들은 뒤로 보내야된다.
//계속해서 뒤로 보내야하는 작업이 생기기때문에 배열은 좋지않고 연결리스트로 풀어야할것같다.
public class Num018_11399 {
	
	static int arr[];
	
	public static int find(int lo, int hi, int compare) {
		
		while(lo <= hi) {
			int mid = lo + (hi-lo) / 2;
			if(arr[mid] == compare) {
				return mid;
			}
			else if(arr[mid] > compare) {
				hi = mid - 1;
			}
			else {
				lo = mid + 1;
			}
		}
		
		return lo;
	}
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		
		arr = new int[num];
		
		String s = bf.readLine();
		
		StringTokenizer st = new StringTokenizer(s);
		
		int idx = 0;
		while(st.hasMoreTokens()) {
			arr[idx++] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i = 1; i <= arr.length - 1; ++i) {
			
			int lo = 0;
			int hi = i - 1;
			int tmp = arr[i];
			
			int index = find(lo,hi,tmp);
			
			for(int j = i - 1; j >= index; --j) {
				arr[j+1] = arr[j];
			}
			
			arr[index] = tmp;
			
		}
		
		int total = 0;
		int result = 0;
		for(int i = 0; i < num; ++i) {
			total += arr[i];
			result += total;
		}
		//합배열을 만들어서 사용하는방법도있음
		System.out.print(result);
	}
}