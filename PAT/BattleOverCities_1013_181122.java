import java.util.Scanner;

class Main {

	  static int[] nums = new int[1001];
	  static int[][] g = new int[1001][1001];
	  static int N = 0;
	  static int M = 0;
	  static int K = 0;
	  static int res = 0;
	  
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    M = sc.nextInt();
	    K = sc.nextInt();
	    g = new int[N][N];
	    
	    for (int i=0; i<M; i++) {
	      int p = sc.nextInt()-1;
	      int q = sc.nextInt()-1;
	      g[p][q] = 1;
	      g[q][p] = 1;
	    }
	    
	    
	    for (int i=0; i<K; i++) {
	      nums = new int[N];
	      res = 0;
	      int id = sc.nextInt()-1;
	      if (id == 0) {
	    	  nums[1] = 1;
	        dfs(id, 1);
	      } else {
	    	  nums[0] = 1;
	        dfs(id, 0);
	        
	      }
	      for (int k=0; k<N; k++) {
	    	  if (nums[k]==0 && k!=id) {
	    		  dfs(id,k);
	    		  res ++;
	    	  }
	      }
	      System.out.println(res);
	    }
	    
	  }
	  
	  public static void dfs(int id, int s) {
	    for (int j=0; j<N; j++) {
	      if (g[s][j]==1 && nums[j]==0 && s!=id && j!=id) {
	        nums[j] = 1;
	        dfs(id, j);
	      }
	    }
	  }

}