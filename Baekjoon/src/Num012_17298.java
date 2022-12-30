import java.util.Scanner;
import java.util.Stack;

class Node1 {
	
	int index;
	int num;
	
	public Node1(int index, int num) {
		this.index = index;
		this.num = num;
	}
	
	public void setNode(int index, int num) {
		this.index = index;
		this.num = num;
	}
}

public class Num012_17298 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		int src[] = new int[num];
		Stack<Node1> S = new Stack<>();
		
		for(int i = 0; i < num; ++i) {
			arr[i] = sc.nextInt();
		}
		
		
		Node1 tmp = new Node1(0,arr[0]);
		
		S.push(tmp);
		
		for(int i = 1; i < num; ++i) {
			
			tmp.setNode(i, arr[i]);     
			
			while(!S.isEmpty() && S.peek().num < tmp.num) {
				src[S.peek().index] = tmp.num;
				S.pop();
			}
			
			S.push(tmp);
		}
		
		for(int i = 0; i < num; ++i) {
			if(src[i] == 0) {
				System.out.print("-1"+" ");
			}
			else {
				System.out.print(src[i]);
				System.out.print(" ");
			}
		}
	}

}
