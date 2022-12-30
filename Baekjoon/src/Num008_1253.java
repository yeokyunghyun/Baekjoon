import java.util.Arrays;
import java.util.Scanner;

public class Num008_1253 {
	
	public static int[] src;
	public static int[] tmp;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		src = new int[num];
		tmp = new int[num];
		
		for(int i = 0; i < num; i++) {
			src[i] = sc.nextInt();
		}
		
		Arrays.sort(src);
		
		for(int i = 0; i < num; i++) {
			System.out.print(src[i]);
		}
		
		int count = 0;
		
		for(int i = num-1; i > 1; i--) {
			
			int start = 0;
			int end = i-1;
			
			while(start != end) {
				
				if(src[start] + src[end] == src[i]) {
					count++;
					break;
				}
				else if(src[start] + src[end] < src[i]) {
					start++;
				}
				else {
					end--;
				}
			}
		}
		
		System.out.print(count);
	}
	
public static void mergeSort(int start, int end) {
	
	if(start<end) {
		int mid = (start + end) / 2;
		
		mergeSort(start,mid);
		mergeSort(mid+1,end);
		
		int p = start;
		int q = mid + 1;
		int init = p;
		
		while(init <= end) {
			
			if(q>end || (p<=mid && src[p] < src[q])) {
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
}
