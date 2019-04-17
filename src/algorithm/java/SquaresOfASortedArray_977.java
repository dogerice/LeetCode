package algorithm.java;

import java.util.Arrays;

/**
 * @Auther:liaohongbing@hisense.com
 * @date:2019/4/17
 * @des
 */
public class SquaresOfASortedArray_977 {
    /**
     * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
     * Example 1:
     * Input: [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Example 2:
     * Input: [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     * Note:
     * 1 <= A.length <= 10000
     * -10000 <= A[i] <= 10000
     * A is sorted in non-decreasing order.
     */
    /**
     * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
     * 示例 1：
     * 输入：[-4,-1,0,3,10]
     * 输出：[0,1,9,16,100]
     * 示例 2：
     * 输入：[-7,-3,2,3,11]
     * 输出：[4,9,9,49,121]
     * <p>
     * 提示：
     * 1 <= A.length <= 10000
     * -10000 <= A[i] <= 10000
     * A 已按非递减顺序排序。
     */

    public int[] sortedSquares(int[] A) {
        for (int i=0;i<A.length;i++){
//            A[i]=Integer.parseUnsignedInt(A[i]+"");
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }

    /**
     * 双指针解法
     * @param A
     * @return
     */
    public int[] sortedSquares2(int [] A){
        int length = A.length;
        int[] ans = new int[length];

        int left = 0;
        int right = length-1;
        int ansIndex = length-1;

        while (left<=right){
            int l2 = A[left]*A[left];
            int r2 = A[right]*A[right];

            if (l2 >=r2){
                ans[ansIndex--] = l2;
                left ++;
            }else{
                ans[ansIndex--] = r2;
                right--;
            }
        }

        return ans;
    }

}
