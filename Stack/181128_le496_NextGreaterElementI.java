class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=nums2.length-1; i>=0; i--) {
            int n = nums2[i];
            while (!stack.isEmpty() && stack.peek()<=n)
                stack.pop();
            if (stack.isEmpty())
                map.put(n, -1);
            else
                map.put(n, stack.peek());
            stack.push(n);
        }
        
        for (int i=0; i<nums1.length; i++)
            res[i] = map.get(nums1[i]);
        return res;
    }
}