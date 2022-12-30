import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//퀵정렬에대해 공부한다. 먼저 퀵정렬은 pivot이라는 대푯값을 정한뒤에 그 대푯값을 기준으로 start와 end를 하고 총 3가지의단계를 반복해서
//진행한다. 그리고 마지막에 start와 end가 만나는 지점에 pivot값이 그 수보다 크다면 1개 더한 인덱스 아니라면 1개작은 인덱스로 pivot값으 ㄹ넣어준뒤 다시 2개로 나누어서 퀵정렬을 실행한다.

public class Num019_11004 {
	
	static int arr[];
	
	static public void quick(int start, int end) { //end는 인덱스의 마지막
		while(start < end) {
			int pivot = arr[end];
			end = end - 1;
			
			if(arr[start] < pivot) {
				++start;
				if(start == end) {
					int result;
					if(arr[start] > pivot) {
						result = start + 1;
					}
					else {
						result = start;
					}
					
					for(int j = end; j >= result; --j) {
						arr[j+1] = arr[j];
					}
					
					arr[result] = pivot;
					
					quick(result + 1, end + 1);
					quick(0,result - 1);
					return;
				}
			}
			
			if(arr[end] > pivot) {
				--end;
				if(start == end) {
					int result;
					if(arr[start] > pivot) {
						result = start + 1;
					}
					else {
						result = start;
					}
					
					for(int j = end; j >= result; --j) {
						arr[j+1] = arr[j];
					}
					
					arr[result] = pivot;
					quick(result + 1, end + 1);
					quick(0,result - 1);
					return;
				}
			}
			
			if(arr[start] > pivot && arr[end] < pivot) {
				int tmp;
				tmp = arr[start];
				arr[start] = arr[end];
				arr[end] = tmp;
			}
		}
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		
		//StringTokenizer을 이용해서 분할해줄거임.
		
		arr = new int[num];
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int index = 0;
		
		while(st.hasMoreTokens()) {
			arr[index++] = Integer.parseInt(st.nextToken());
		}
		
		quick(0,num-1);
	}
}
