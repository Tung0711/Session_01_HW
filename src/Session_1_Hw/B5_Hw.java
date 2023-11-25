package Session_1_Hw;

import java.util.Scanner;

public class B5_Hw {
    public static void main(String[] args) {
        //Khai bao bien va nhap du lieu
        Scanner scanner = new Scanner(System.in);
        float math, physical, chemistry;
        float literature, english, mediumScore;
        System.out.println("Nhap vao diem mon Toan:");
        math = scanner.nextFloat();
        System.out.println("Nhap vao diem mon Ly:");
        physical = scanner.nextFloat();
        System.out.println("Nhap vao diem mon Hoa:");
        chemistry = scanner.nextFloat();
        System.out.println("Nhap vao diem mon Van:");
        literature = scanner.nextFloat();
        System.out.println("Nhap vao diem mon Anh:");
        english = scanner.nextFloat();
        //tinh diem trung binh
        mediumScore = (math + physical + chemistry + literature +english)/5;
        System.out.printf("Diem trung binh cac mon: %.2f\n" ,mediumScore);
        //xep loai hoc luc
        System.out.print("Xep loai hoc luc:");
        if (0 <= mediumScore && mediumScore <5){
            System.out.println("Xep loai Yeu.");
        } else if (5 <= mediumScore && mediumScore < 6.5) {
            System.out.println("Xep loai Trung Binh.");
        } else if (6.5 <= mediumScore && mediumScore < 8) {
            System.out.println("Xep loai Kha.");
        } else if (8 <= mediumScore && mediumScore < 9) {
            System.out.println("Xep loai Gioi.");
        }else {
            System.out.println("Xep loai Xuat Sac.");
        }
    }
}
