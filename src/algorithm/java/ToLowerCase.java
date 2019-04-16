package algorithm.java;

/**
 * @Auther:liaohongbing@hisense.com
 * @date:2019/4/16
 * @des
 */
public class ToLowerCase {
    /**
     * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
     * Example 1
     * Input: "Hello"
     * Output: "hello"
     * Example 2:
     * Input: "here"
     * Output: "here"
     * Example 3:
     * Input: "LOVELY"
     * Output: "lovely"
     */

    /**
     * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
     * 示例 1：
     * 输入: "Hello"
     * 输出: "hello"
     */

    public String toLowerCase(String str) {
        char[] strArray = str.toCharArray();
        for (int i = 0;i<strArray.length;i++) {
            if (strArray[i]>='A'&&strArray[i]<='Z')
                strArray[i]+=32;
        }
        return new String(strArray);
    }
}
