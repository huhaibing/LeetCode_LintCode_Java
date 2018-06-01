public class Solution {
    /**
     * @param n: n
     * @param k: the k th permutation
     * @return: return the k-th permutation
     */
    public String getPermutation(int n, int k) {
        // write your code here
        int[] nums = new int[n];
        for (int i=0; i < n; i++) {
            nums[i] = i+1;
        }
        String[] res = Permutation(nums);
        return res[k-1];
    }
    
    public String[] Permutation(int[] nums) {
		if (nums.length==0)
			return null;
		int len = nums.length;
		String[] res = new String[factorial(len)];
		
		if (nums.length == 1) {
			res[0] = String.valueOf(nums[0]);
			return res;
		}
		
		int k = 0, loc = len-1, p = 0;
		boolean flag = true;
		System.out.println(factorial(len));
		while (k < factorial(len)) {
			if (flag) {
				while (loc > 0) {
					res[k++] = helpPermutation(nums);
					loc --;
					int tmp = nums[loc];
					nums[loc] = nums[loc+1];
					nums[loc+1] = tmp;
				}
				res[k++] = helpPermutation(nums);
				int temp = nums[len-1];
				nums[len-1] = nums[len-2];
				nums[len-2] = temp;
				flag = false;
			} else {
				while (loc < nums.length-1) {
					res[k++] = helpPermutation(nums);
					loc ++;
					int tmp = nums[loc];
					nums[loc] = nums[loc-1];
					nums[loc-1] = tmp;
				}
				res[k++] = helpPermutation(nums);
				int temp = nums[0];
				nums[0] = nums[1];
				nums[1] = temp;
				flag = true;
			}
		}
		Arrays.sort(res);
		return res;
	}
	public String helpPermutation(int[] nums) {
		String str = "";
		for (int i=0; i<nums.length; i++) {
			str += nums[i];
		}
		return str;
	}
	public int factorial(int n) {
		if (n == 1)
			return 1;
		else 
			return factorial(n-1) * n;
	}
}