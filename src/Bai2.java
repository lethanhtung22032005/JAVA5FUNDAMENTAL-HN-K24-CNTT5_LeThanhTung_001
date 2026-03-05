import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
// Nhập vào n phần tử
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử (0 < n < 100): ");
        int n = sc.nextInt();
        if (n <= 0 || n >= 100) {
            System.out.println("Số lượng phần tử không hợp lệ.");
            return;
        }
        // Nhập vào các phần tử của mảng
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

// Sử dụng map để đếm số lần xuất hiện của mỗi số
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        // In ra kết quả ra màn hình
        System.out.println("Số xuất hiện và số lần xuất hiện:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("Số " + entry.getKey() + " xuất hiện :" + entry.getValue() + " lần");
        }
    }
}
