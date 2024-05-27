package ra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Bai tap session 14");
            System.out.println("Chon 1 de xem bai tap 1: ");
            System.out.println("Chon 2 de xem bai tap 2: ");
            System.out.println("Chon 0 de thoat chuong trinh: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Quadratic.main(null);
                    break;
                case 2:
                    InputTypeJava.main(null);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Khong co bai tap nay");
                    break;
            }
        } while (choice != 0);
    }
}
