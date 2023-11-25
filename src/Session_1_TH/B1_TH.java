package Session_1_TH;

import java.util.Scanner;

public class B1_TH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, square;
        System.out.println("Nhap vao 1 so nguyen:");
        number = sc.nextInt();
        square = number * number;
        System.out.println("Binh phuong cua so da nhap bang:" + square);
    }
}
