import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Num013_2164 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Deque<Integer> myDeque = new LinkedList<Integer> ();
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; ++i) {
			myDeque.add(i);
		}
		
		while(myDeque.size() > 1) {
			myDeque.remove();
			int tmp = myDeque.remove();
			myDeque.add(tmp);
		}
		
		System.out.print(myDeque.getFirst());
		
	}
}
