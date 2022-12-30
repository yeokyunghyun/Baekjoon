import java.util.Scanner;

public class Num001_11720 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String arr = sc.next();
		char arr2[] = arr.toCharArray();
		
		int total = 0;
		
		for(int i=0; i<arr2.length; i++) {
			total+= (int)(arr2[i] -'0');
		}
		
		System.out.println(total);
	}
}
