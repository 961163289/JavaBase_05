package 数组;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        int temp = 0;//用于辅助交换的变量
        boolean flag = true;

        //将多轮排序使用为外层循环包括起来即可
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //如果前面的数>后面的数,就交换
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
            System.out.println("\n第" + (i + 1) + "轮排序后:");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }

        }

        System.out.println("\n排序完成:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
