package Session_1_TH;

import java.util.Scanner;

public class B3_TH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius;
        Double area, circuit;
        System.out.println("Nhap vao ban kinh hinh tron:");
        radius = sc.nextInt();
        //Tinh chu vi hinh tron
        circuit = radius * 2 * 3.14;
        //Tinh dien tich hinh tron
        area = radius * radius * 3.14;
        //in ra man hinh
        System.out.printf("Chu vi hinh tron la:%.2f\n" ,circuit);
        System.out.printf("Dien tich hinh tron la:%.2f" ,area);
    }
}
