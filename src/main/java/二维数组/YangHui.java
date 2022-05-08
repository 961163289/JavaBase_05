package 二维数组;

public class YangHui {
    public static void main(String[] args) {
        /**
         * 1
         * 1 1
         * 1 2 1
         * 1 3 3 1
         * 1 4 6 4 1
         * 1 5 10 10 5 1
         *
         * 规律
         * 1.第一行有 1 个元素, 第 n 行有 n 个元素
         * 2.每一行的第一个元素和最后一个元素都是 1
         * 3.从第三行开始, 对于非第一个元素和最后一个元素的元素的值.
         *   arr[i][j] arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; //必须找到这个规律
         */
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            //给每个一维数组(行) 开空间
            arr[i] = new int[i + 1];
            //给每个一维数组(行) 赋值
            for (int j = 0; j < arr[i].length; j++) {
                //每一行的第一个元素和最后一个元素都是 1
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {//中间的元素
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        //输出杨辉三角
        System.out.println("==========杨辉三角==========");
        //遍历 arr 输出
        for (int i = 0; i < arr.length; i++) {
            //输出 arr 的每个一维数组
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();//换行
        }
    }
}
