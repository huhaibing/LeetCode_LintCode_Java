import java.util.Scanner;

class Main {

	  static int maxs = Integer.MIN_VALUE;
	  static int sum = 0;
	  static int s = 0;
	  static int e = 0;
	  static int ss = 0;
	  static int se = 0;
	  
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int K = sc.nextInt();
	    sc.nextLine();
	    String[] ns = sc.nextLine().split(" ");
	    for (int i=0; i<K; i++) {
	      int tmp = Integer.valueOf(ns[i]);
	      if (sum == 0) {
	    	  ss = tmp;
	      }
	      sum += tmp;
	      se = tmp;
	      if (sum > maxs) {
		        maxs = sum;
		        s = ss;
		        e = se;
		  }
	      if (sum < 0) {
		        sum = 0;
		        ss = 0;
		        se = 0;
		  }
	    }
	    if (maxs < 0)
	    	System.out.print(0 + " " + ns[0] + " " +ns[K-1]);
	    else
	    	System.out.print(maxs+" "+s+" "+e);
	    
	  }

}