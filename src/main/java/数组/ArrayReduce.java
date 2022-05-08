package 数组;

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        do {
            int[] arrNew = new int[arr.length - 1];
            for (int i = 0; i < arrNew.length; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
            System.out.println("==arr缩减后元素情况==");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("\n是否继续缩减 y/n");
            char key = myScanner.next().charAt(0);

            if (key == 'n') {//如果输入n,就结束
                break;
            } else if (arrNew.length - 1 == 0) {
                System.out.println("数组仅剩1位~~");
                break;
            }

        } while (true);

        System.out.println("已退出缩减~~~");
    }
}
