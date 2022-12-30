import java.util.Scanner;
import java.util.Stack;

public class Num011_1874 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean check = false;
		int arr[] = new int[num];
		
		for(int i = 0; i < num; ++i) {
			arr[i] = sc.nextInt();
		}
		
		int up_num = 1;
		
		Stack<Integer> S = new Stack<Integer>();
		
		StringBuffer bf = new StringBuffer();
		
		for(int i = 0; i < num; ++i) {
			int comp = arr[i];
			
			if(comp >= up_num) {
				while(comp >= up_num) {
					S.add(up_num++);
					bf.append("+\n");
				}
				
				S.pop();
				bf.append("-\n");
			}
			
			else {
				int tmp = S.pop();
				
				if(tmp > comp) {
					System.out.print("No");
					check = true;
					break;
				}
				else {
					bf.append("-\n");
				}
			}
		}
		
		if(check) return;
		else {
			System.out.print(bf);
		}
	}
}
