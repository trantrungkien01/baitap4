import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng 1 chiều: ");
        int n = Integer.parseInt(sc.nextLine());
        float[] mang = new float[n];
        System.out.println("Nhập giá trị cho các phần tử của mảng 1 chiều: ");
        float sum = 0;
        for (int i = 0; i < n; i++) {
            mang[i] = sc.nextFloat();
            sum += mang[i];
        }
        float trungbinh = sum / n;
        System.out.println("Giá trị trung bình cộng của các phần tử trong mảng là: " + trungbinh);
    }
}


