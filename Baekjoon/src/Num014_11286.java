import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Num014_11286 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		PriorityQueue<Integer> myQueue = new PriorityQueue<Integer>(new Comparator<Integer>(){
			@Override
			public int compare(Integer a, Integer b) {
				
				int A = Math.abs(a);
				int B = Math.abs(b);
				
				if(A>B) {
					return 1;
				}
				else if(A==B) {
					if(a>b) {
						return 1;
					}
					else return -1;
				}
				else {
					return -1;
				}
			}
		});
		
		for(int i = 0; i < num; ++i) {
			int tmp = sc.nextInt();
			
			if(tmp == 0) {
				if(!myQueue.isEmpty())
					System.out.println(myQueue.remove());
				else
					System.out.println(0);
			}
			else {
				myQueue.add(tmp);
			}
		}
	}
}
