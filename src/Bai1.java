import java.util.List;
import java.util.ArrayList;

public class Bai1 {
    public static void main(String[] args){
        List<Double> expenses = new ArrayList<>();
        expenses.add(150.0);
        expenses.add(50.0);
        expenses.add(320.0);
        expenses.add(100.0);
        expenses.add(50.0);
        expenses.add(450.0);
        expenses.add(20.5);

//Tổng số tiền đã tiêu
        double total = 0;
        for (double expense : expenses) {
            total += expense;
        }
        System.out.println("Tổng chi tiêu: " + total);

//Ngày (vị trí chí trong danh sách) có mức chi tiêu cao nhất và số tiền lớn nhất
//Ngày có mức chi tiêu thấp nhất và số tiền nhỏ nhất
        double maxExpense = Double.MIN_VALUE;
        int maxDay = -1;
        double minExpense = Double.MAX_VALUE;
        int minDay = -1;

        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i) > maxExpense) {
                maxExpense = expenses.get(i);
                maxDay = i + 1;
            }
            if (expenses.get(i) < minExpense) {
                minExpense = expenses.get(i);
                minDay = i + 1;
            }
        }

        System.out.println("Chi tiêu nhiều nhất: Ngày " + maxDay + " với " + maxExpense + " VNĐ");
        System.out.println("Chi tiêu thấp nhất: Ngày " + minDay + " với " + minExpense + " VNĐ");

//Mức chi tiêu trung bình mỗi ngày
        double average = total / expenses.size();
        System.out.println("Trung bình / ngày: " + average + " VNĐ");
//Số ngày chi tiêu trên mức trung bình
        int aboveAverageDays = 0;
        for (double expense : expenses) {
            if (expense > average) {
                aboveAverageDays++;
            }
        }
        System.out.println("Số ngày vượt trung bình: " + aboveAverageDays);

    }
}
