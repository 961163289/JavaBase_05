package 数组;

public class ArrayReverse02 {
    public static void main(String[] args) {
        //定义数组
        int[] arr1 = {11, 22, 33, 44, 55, 66};
        //使用逆序赋值方式
        //老韩思路
        //1. 先创建一个新的数组 arr2 ,大小 arr.length
        //2. 逆序遍历 arr ,将 每个元素拷贝到 arr2 的元素中(顺序拷贝)
        //3. 建议增加一个循环变量 j -> 0 -> 5
        int[] arr2 = new int[arr1.length];
        //逆序遍历 arr
        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr1[i];
        }
        //4. 当 for 循环结束，arr2 就是一个逆序的数组 {66, 55, 44,33, 22, 11}
        //5. 让 arr 指向 arr2 数据空间,  此时 arr 原来的数据空间就没有变量引用会被当做垃圾，销毁
        arr1 = arr2;

        //6. 输出 arr 看看
        System.out.println("====arr1 的元素情况=====");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

        System.out.println("\n====arr2 的元素情况=====");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
    }
}
