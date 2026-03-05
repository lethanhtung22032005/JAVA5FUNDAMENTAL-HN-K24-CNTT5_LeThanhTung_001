import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên dương: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Không được nhập số âm.");
        }
    }
}
