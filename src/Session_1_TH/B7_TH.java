package Session_1_TH;

import java.util.Scanner;

public class B7_TH {
    public static void main(String[] args) {
        int soNguyen, surplus;
        int total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên có 4 chữ số: ");
        soNguyen = sc.nextInt();

        // Kiểm tra xem số có đúng 4 chữ số hay không
        if (soNguyen >= 1000 && soNguyen <= 9999) {

            // Tính tổng các chữ số
            int temp = soNguyen;
            while (temp > 0) {
                surplus = temp % 10;
                total += surplus;
                temp /= 10;
            }

            // Tính số nghịch đảo
            int inverseNumber = 0;
            temp = soNguyen;

            while (temp > 0) {
                surplus = temp % 10;
                inverseNumber = inverseNumber * 10 + surplus;
                temp /= 10;
            }

            // In kết quả ra màn hình console
            System.out.println("Tổng các chữ số là: " + total);
            System.out.println("Số nghịch đảo là: " + inverseNumber);
        } else {
            System.out.println("Vui lòng nhập số nguyên có 4 chữ số.");
        }
    }
}
