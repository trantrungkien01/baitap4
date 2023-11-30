import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng: ");
        int row = sc.nextInt();

        System.out.print("Nhập số cột của mảng: ");
        int col = sc.nextInt();

        double[][] arr = new double[row][col];

        System.out.println("Nhập giá trị của các phần tử mảng:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }

        double sumOfEven = 0;

        System.out.println("Các phần tử có giá trị chẵn:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println(arr[i][j]);
                    sumOfEven += arr[i][j];
                }
            }
        }

        System.out.println("Tổng các phần tử chẵn trong mảng: " + sumOfEven);
    }
}


