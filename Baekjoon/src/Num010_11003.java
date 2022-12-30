import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

//시간초과

class Node {
	int index;
	int num;
	
	public Node(int index, int num) {
		this.index = index;
		this.num = num;
	}
}

public class Num010_11003{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = sc.nextInt();
		
		Deque<Node> deque = new LinkedList<Node> ();
		
		Node tmp;
		for(int i = 1; i <= N; i++) {
			
			tmp = new Node(i,sc.nextInt());
			
			while(!deque.isEmpty()) {
				if(deque.getLast().num >= tmp.num) {
					deque.removeLast();
				}
				else {
					break;
				}
			}
			
			deque.addLast(tmp);
			
			if(deque.getFirst().index == i-L) deque.removeFirst();
			
			System.out.print(deque.getFirst().num);
			System.out.print(" ");
		}
		
	}
}
