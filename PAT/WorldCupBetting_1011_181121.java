import java.util.Scanner;

class Main {

	  static int[] loc = new int[3];
	  static float[] buy = new float[3];
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    for (int i=0; i<3; i++) {
	      String[] line = sc.nextLine().split(" ");
	      float w = Float.valueOf(line[0]);
	      float t = Float.valueOf(line[1]);
	      float l = Float.valueOf(line[2]);
	      
	      if (w > t) {
	        if (w > l) {
	          loc[i] = 0;
	          buy[i] = w;
	        } else {
	          loc[i] = 2;
	          buy[i] = l;
	        }
	      } else {
	        if (t > l) {
	          loc[i] = 1;
	          buy[i] = t;
	        } else {
	          loc[i] = 2;
	          buy[i] = l;
	        }
	      }
	    }
	    
	    for (int i=0; i<3; i++) {
	      switch (loc[i]) {
	        case 0:
	          System.out.print("W");
	          break;
	        case 1:
	          System.out.print("T");
	          break;
	        case 2:
	          System.out.print("L");
	          break;
	      }
	      System.out.print(" ");
	    }
	    System.out.printf("%.2f", (buy[0]*buy[1]*buy[2]*0.65-1)*2);
	  }


}