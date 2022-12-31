import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num017_1427 {
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		
		char []arr = s.toCharArray();
		
		int maxIndex;
		
		for(int i = 0; i < arr.length - 1; ++i) {
			maxIndex = i;
			for(int j = i + 1; j < arr.length; ++j) {
				maxIndex = arr[j] > arr[maxIndex] ? j : maxIndex; 
			}
			
			if(maxIndex != i) {
				char tmp = arr[i];
				arr[i] = arr[maxIndex];
				arr[maxIndex] = tmp; //arr은 char형인데 tmp는 현재 int형이기때문에 형이안맞음
			}
			
		}
		
		for(int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i]);
		}
	}
}
//수정