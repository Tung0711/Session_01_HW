package Session_1_Hw;

import java.util.Scanner;

public class B2_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Nhập vào giá trị USD:");
        int USD = scanner.nextInt();
        int VND = rate*USD;
        System.out.println("Gia tri VND:" +VND);
    }
}
