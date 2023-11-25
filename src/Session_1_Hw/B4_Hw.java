package Session_1_Hw;

import java.util.Scanner;

public class B4_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length, width, perimeter, acreage;
        System.out.println("Nhập vào chiều dài:");
        length = scanner.nextInt();
        System.out.println("Nhập vào chiều rộng:");
        width = scanner.nextInt();

        perimeter = (length + width) * 2;
        acreage = length * width;

        System.out.println("Chu vi hình chữ nhật là:" +perimeter);
        System.out.println("Diện tích hình chữ nhật là:" +acreage);
    }
}
