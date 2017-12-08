/*
合并两个排序的整数数组A和B变成一个新的数组。
样例
给出A=[1,2,3,4]，B=[2,4,5,6]，返回 [1,2,2,3,4,4,5,6]
*/
public class Solution {
    /*
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
	 /*类似于快速排序中的merge()*/
    public int[] mergeSortedArray(int[] A, int[] B) {
		 int i=0, j=0, k=0;
		 int[] temp = new int[A.length + B.length];
		 while (i<=A.length-1 && j<B.length) {
			 if (A[i] <= B[j]) {
				 temp[k++] = A[i++];
				 
			 } else {
				 temp[k++] = B[j++];
			 }
		 }
		 while(i < A.length) {
			 temp[k++] = A[i++];
		 }
		 while(j < B.length) {
			 temp[k++] = B[j++];
		 }
		 return temp;
	 }
}