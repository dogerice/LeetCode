package algorithm.java;

import java.util.Arrays;

/**
 * @Auther:liaohongbing@hisense.com
 * @date:2019/4/17
 * @des
 */
public class FlippingAnImage_832 {
    /**
     *
     */
    /**
     * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
     * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
     * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
     * 示例 1:
     * 输入: [[1,1,0],[1,0,1],[0,0,0]]
     * 输出: [[1,0,0],[0,1,0],[1,1,1]]
     * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
     *      然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
     * 示例 2:
     * 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
     * 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
     *      然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * 说明:
     * 1 <= A.length = A[0].length <= 20
     * 0 <= A[i][j] <= 1
     */
    public int[][] flipAndInvertImage(int[][] A) {
        for (int row = 0;row < A.length;row++){
            int colLen = A[row].length;
            for (int col = 0;col<colLen/2;col++){
                int temp = A[row][col];
                A[row][col]=A[row][colLen-1-col];
                A[row][colLen-1-col] = temp;
            }
            for (int col = 0;col<colLen;col++){
                A[row][col] = 1-A[row][col]; // x:(0,1) 翻转 =》  1-x
            }
        }
        return A;
    }
}
