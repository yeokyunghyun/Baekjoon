import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Num023_11724 {
	
	static ArrayList<Integer> arr[];
	static boolean visited[];
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int node = Integer.parseInt(st.nextToken());
		int edge = Integer.parseInt(st.nextToken());
	
		arr = new ArrayList[node+1];
		
		
		for(int i = 1; i <= node; ++i) {
			arr[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < edge; ++i) {
			st = new StringTokenizer(bf.readLine());
			
			int x;
			int y;
			
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			arr[x].add(y);
			arr[y].add(x);	
		}
		
		
		/*
		 dfs를 진행할때 2차원배열 체크는 끝났고 이제 dfs 함수를 이용해서 몇가지의 연결갯수가 나오는지 파악해야됨.
		 방문여부를 파악하기위해 visited 배열 선언
		 */
		visited = new boolean[node+1];
		
		int count = 0;
		
		for(int i = 1; i <= node; ++i) {
			if(visited[i] == false) {
				dfs(i);
				++count;
			}
		}
		
		System.out.print(count);
	}
	
	static public void dfs(int num) {
		
		if(visited[num]) return;
		
		visited[num] = true;
		
		for(int i : arr[num]) {
			if(!visited[i])
			dfs(i);
		}
	}
	
}
