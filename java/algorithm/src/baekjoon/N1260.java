package baekjoon;

import java.util.*;

public class N1260 {
	public static int N; // node
	public static int M; // edge
	public static int V; // start
	
	public static boolean[] visited = new boolean[0];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	public static void dfs(int x) {
		visited[x] = true;
		System.out.print(x + " ");
		
		for(int i = 0; i < graph.get(x).size(); i++) {
			int y = graph.get(x).get(i);
			
			if(!visited[y]) dfs(y);
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			int x = q.poll();
			System.out.print(x + " ");
			
			for(int i = 0; i < graph.get(x).size(); i++) {
				int y = graph.get(x).get(i);

				if(!visited[y]) {
					q.offer(y);
					visited[y] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); 
		M = sc.nextInt(); 
		V = sc.nextInt(); 
		
		visited = new boolean[N + 1];
		
		// graph 초기화
		for(int i = 0; i < N + 1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < M; i++) {
			int node = sc.nextInt();
			int connected = sc.nextInt();
		
			graph.get(node).add(connected);
			graph.get(connected).add(node);
		}
		
		// 노드 정렬
		for(int i = 0; i < N + 1; i++) {
			Collections.sort(graph.get(i));
		}
		
		dfs(V);
		visited = new boolean[N + 1];
		
		System.out.println();
		bfs(V);
	}
}