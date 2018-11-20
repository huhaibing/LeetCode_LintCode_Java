import java.util.Scanner;

class Main {
  
  static int N = 0;
  static int loc = 0;
  static int time = 0;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    for (int i=0; i<N; i++) {
      int tmp = sc.nextInt();
      if (loc < tmp) {
        time += 6 * (tmp-loc) + 5;
      } else if (loc > tmp) {
        time += 4 * (loc-tmp) + 5;
      } else {
        time += 5;
      }
      loc = tmp;
    }
    System.out.print(time);
  }
}