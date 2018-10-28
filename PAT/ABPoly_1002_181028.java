package pat;
import java.util.Scanner;

public class ABPoly {
	public static void main(String[] args) {
		// nums[i]为 i 次方的系数
		double[] nums = new double[10001];
		int maxexp = 0;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<2; i++) {
			int num = sc.nextInt();
			for (int j=0; j<num; j++) {
				nums[sc.nextInt()] += sc.nextFloat();
			}
		}
		// 找到项的个数
		int k = 0;
		for (int i=10000; i>=0; i--) {
			if (nums[i] != 0) {
				k ++;
			}
		}
		System.out.print(k);
		// 打印各个系数
		for (int i=10000; i>=0; i--) {
			if (nums[i] != 0)
				System.out.printf(" %d %.1f", i, nums[i]);
		}
	}
}