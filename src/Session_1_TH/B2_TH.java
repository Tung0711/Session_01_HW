package Session_1_TH;

import java.util.Scanner;

public class B2_TH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, width;
        int circuit, area;
        System.out.println("Nhap vao chieu dai hinh chu nhat:");
        length = sc.nextInt();
        System.out.println("Nhap vao chieu rong hinh chu nhat:");
        width = sc.nextInt();
        //Tinh chu vi
        circuit = (length + width) * 2;
        //Tinh dien tich
        area = length * width;
        //in ra man hinh
        System.out.println("Chu vi hinh chu nhat la:" +circuit);
        System.out.println("Dien tich hinh chu nhat la:" +area);
    }
}
