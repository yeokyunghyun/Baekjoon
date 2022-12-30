import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num016_1377 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		mData[] a = new mData[num]; // 현재이것은 a에 대한 데이터만 부여한것임.
		for(int i = 0; i < num; ++i) {
			a[i] = new mData(Integer.parseInt(bf.readLine()),i);
		}
		
		Arrays.sort(a);
		
		int max = 0;
		
		for(int i = 0; i < num; ++i) {
			max = (max > a[i].index - i) ? max : a[i].index - i;
			
		}
		System.out.print(max+1);
	}
}

class mData implements Comparable<mData>{
	
	int num;
	int index;
	
	public mData(int num, int index) {
		this.num = num;
		this.index = index;
	}
	
	@Override
	public int compareTo(mData data) {
		return this.num - data.num; // 오름차순으로 정렬한다 하지만 이것의 단점으로는 overflow나 underflow가 발생할수도있다는점이다.
	}
}
