package Session_1_TH;

import java.util.Scanner;

public class B6_TH {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gia tri so nguyen thu 1:");
        num1 = sc.nextInt();
        System.out.println("Nhap vao gia tri so nguyen thu 2:");
        num2 = sc.nextInt();
        System.out.println("Nhap vao gia tri so nguyen thu 3:");
        num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.printf("So %d la so nguyen lon nhat\n" ,num1);
        } else if (num1<num2 && num1>num3) {
            System.out.printf("So %d la so nguyen lon nhat\n" ,num2);
        } else {
            System.out.printf("So %d la so nguyen lon nhat\n" ,num3);
        }
        if(num1<num2 && num1<num3){
            System.out.printf("So %d la so nguyen nho nhat\n" ,num1);
        }else if(num1>num2 && num1<num3){
            System.out.printf("So %d la so nguyen nho nhat\n" ,num2);
        }else{
            System.out.printf("So %d la so nguyen nho nhat\n" ,num3);
        }
    }
}
