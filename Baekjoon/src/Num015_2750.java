import java.util.Scanner;

public class Num015_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		boolean check = false;
		
		for(int i = 0; i < num; ++i) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < num - 1; ++i) {
			for(int j = 0; j < num-1-i; ++j) {
				
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				
			}
			if(check) break;
		}
		
		for(int i = 0; i < num; ++i) {
			System.out.println(arr[i]);
		}
		
	}
}
