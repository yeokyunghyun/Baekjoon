import java.util.Scanner;

public class Num002_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		double arr[] = new double[num];
		double max = 0;
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextDouble();
			max = max > arr[i] ? max : arr[i];
		}
		
		//max를 구한상태
		
		double total = 0;
		
		for(int i = 0; i < num; i++) {
			total += arr[i]/max*100;
		}
		
		total /= num;
		
		System.out.print(total);
	}

}
