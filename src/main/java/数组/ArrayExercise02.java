package 数组;

public class ArrayExercise02 {
    public static void main(String[] args) {

        //请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标
        //思路分析:
        //1. 定义一个 int 数组 int[] arr = {4,-1,9, 10,23};
        //2. 假定 max = arr[0] 是最大值 , maxIndex=0;
        //3. 从下标 1  开始遍历 arr， 如果 max < 当前元素，说明 max  不是真正的
        //	 最大值, 我们就 max=当前元素; maxIndex=当前元素下标
        //4. 当我们遍历这个数组 arr 后 , max 就是真正的最大值，maxIndex 最大值对应的下标

        int[] arr = {4, -1, 9, 10, 23, 15, 12};
        int max = arr[0]; // 假定第一个元素就是最大值
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {// 从下标 1  开始遍历
            if (max < arr[i]) { // 如果 max <  当前元素max
                max = arr[i];   // 把 max  设置成 当前元素
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
    }
}
