package Session_1_TH;

import java.time.LocalDate;
import java.util.Scanner;

public class B8_TH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearOfBirth, currentYear, age;
        String checkAge;
        System.out.println("Nhap vao nam sinh cua ban:");
        yearOfBirth = sc.nextInt();
        LocalDate localDate = LocalDate.now();
        currentYear = localDate.getYear();
        age = currentYear - yearOfBirth;
        System.out.println("Tuoi cua ban la:" +age);
        checkAge = (age %2 ==0)? "Tuổi cua ban la so chan" :
                "Tuổi cua ban la so le";
        System.out.println("Ket qua:"+checkAge);
    }
}
