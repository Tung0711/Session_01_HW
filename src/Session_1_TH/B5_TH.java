package Session_1_TH;

import java.util.Scanner;

public class B5_TH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float math, literature, english;
        float totalScore, mediumScore;
        System.out.println("Nhap vao diem mon Toan:");
        math = sc.nextFloat();
        System.out.println("Nhap vao diem mon Van:");
        literature = sc.nextFloat();
        System.out.println("Nhap vao diem mon Anh");
        english = sc.nextFloat();
        //Tinh tong diem
        totalScore = math + literature + english;
        //Tinh diem trung binh
        mediumScore = (math + literature + english)/3;
        //In ra man hinh
        System.out.println("Tong diem:" +totalScore);
        System.out.printf("Diem trung binh:%.2f",mediumScore);
    }
}
