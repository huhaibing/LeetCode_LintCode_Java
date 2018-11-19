import java.util.Scanner;

class Main{
	static int[][] tree = new int[1001][1001];
	static int[] K = new int[1001];					// child num of every leaf
	static int[] res = new int[1001];
	static int maxc = 1;
	static int N = 1;
	static int M = 1;
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    M = sc.nextInt();
	    
	    for (int i=0; i<M; i++) {
	    	int index = Integer.valueOf(sc.next());
	    	K[index] = sc.nextInt();
	    	for (int j=0; j<K[index]; j++) {
	    		tree[index][sc.nextInt()] = 1;
	    	}
	    }
	    
	    int s = 1;
    	for (; s<=N; s++) {
    		int sum = 0;
    		for (int k=0; k<=N; k++)
    			sum += tree[k][s];
    		if (sum == 0)
    			break;
    	}
    	BFS(tree, s, 1, res);
    	
	    
	    System.out.print(res[1]);
	    for (int m=2; m<=maxc; m++)
	    	System.out.print(" " + res[m]);
	    
	}
	
	public static int[] BFS(int[][] tree, int s, int c, int[] res) {
		int sum = 0;
		for (int i=1; i<=N; i++)
			sum += tree[s][i];
		if (sum == 0)
			res[c] ++;
		for (int j=1; j<=N; j++) {
			if (tree[s][j] == 1) {
				BFS(tree, j, c+1, res);
			}
			if (c > maxc)
				maxc = c;
		}
		return res;
	}

}