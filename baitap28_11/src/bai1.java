import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mang = new int[5];
        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < 5; i++) {
            mang[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Các phần tử của mảng là:");
        for (int i = 0; i < 5; i++) {
            System.out.println(mang[i]);
        }
    }
}


