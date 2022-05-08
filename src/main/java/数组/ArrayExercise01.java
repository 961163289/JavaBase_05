package 数组;

public class ArrayExercise01 {
    public static void main(String[] args) {

        /**
         * 创建一个 char 类型的 26 个元素的数组，分别 放置'A'-'Z'。使用 for 循环访问所有元素并打印出来。
         * 提示：char 类型数据运算 'A'+1 -> 'B'
         *
         * 思路分析
         * 1.定义一个 数组	char[] chars = new char[26]
         * 2.因为 'A' + 1 = 'B' 类推，所以老师使用 for 来赋值
         * 3.使用 for 循环访问所有元素
         */

//        char[] chars = new char[26];
//        int i = 0;
//        for (char c1 = 'A'; c1 <= 'Z'; c1++) {
//            chars[i] = c1;
//            i++;
//        }
//        for (int j = 0; j < chars.length; j++) {
//            System.out.print(chars[j] + " ");
//        }

        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            //chars 是 char[]
            //chars[i] 是 char
            chars[i] = (char) ('A' + i); // 'A' + i 是 int,强转
        }
        //循环输出
        for (int j = 0; j < chars.length; j++) {
            System.out.print(chars[j] + " ");
        }

    }
}
