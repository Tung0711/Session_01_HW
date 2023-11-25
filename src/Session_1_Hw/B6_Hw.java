package Session_1_Hw;

import java.util.Scanner;

public class B6_Hw {
    public static void main(String[] args) {
        int number;
        String checkNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so can kiem tra:");
        number = scanner.nextInt();

        checkNumber = (number %3 == 0 && number %5 == 0)? "Chia het cho ca 3 va 5" :
                (number %3 == 0 && number %5 != 0)? "Chi chia het cho 3" :
                        (number %3 != 0 && number %5 == 0)? "Chi chia het cho 5" :
                                "Khong chia het cho 3 va 5";
        System.out.println("Ket qua:" + checkNumber);
    }
}
