import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng của mảng: ");
        int row = sc.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        System.out.println("Nhập giá trị của các phần tử mảng:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("array[" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Giá trị các phần tử của mảng theo ma trận:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\t");
        }
    }
}