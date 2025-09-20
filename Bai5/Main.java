package Bai5;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Mã sinh viên: 23115053122346
      Scanner sc = new Scanner(System.in);
      KhuPho kp_346 = new KhuPho();

      int choice;
      do {
            System.out.println("\n===== MENU QUẢN LÝ KHU PHỐ =====");
            System.out.println("1. Nhập danh sách hộ dân");
            System.out.println("2. Hiển thị toàn bộ hộ dân");
            System.out.println("3. Hiển thị các hộ có người >= 80 tuổi");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
               case 1:
                  kp_346.nhap(sc);
                  break;
               case 2:
                  System.out.println("\n--- DANH SÁCH TOÀN BỘ HỘ DÂN ---");
                  kp_346.hienThiTatCa();
                  break;
               case 3:
                  System.out.println("\n--- DANH SÁCH HỘ CÓ NGƯỜI ≥ 80 TUỔI ---");
                  kp_346.hienThiThuongTho();
                  break;
               case 4:
                  System.out.println("Thoát chương trình!");
                  break;
               default:
                  System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
      } while (choice != 4);

      sc.close();
   }
}