package 二维数组;

public class TwoDimensionalArray05 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arr = {{1, 1, 1}, {8, 8, 8}, {-100}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("sum = " + sum);
    }
}
