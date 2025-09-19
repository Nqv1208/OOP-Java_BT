package Bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<BienLai> ds = new ArrayList<>();

      int choice;
      do {
            System.out.println("\n===== MENU QUẢN LÝ BIÊN LAI ĐIỆN =====");
            System.out.println("1. Nhập thông tin biên lai");
            System.out.println("2. Hiển thị tất cả biên lai");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
               case 1: {
                  System.out.print("Nhập số lượng biên lai: ");
                  int n = Integer.parseInt(sc.nextLine());
                  for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Nhập biên lai hộ thứ " + (i + 1) + " ---");
                        BienLai bl = new BienLai();
                        bl.nhap(sc);
                        ds.add(bl);
                  }
                  break;
               }
               case 2: {
                  System.out.println("\n=== DANH SÁCH BIÊN LAI ===");
                  if (ds.isEmpty()) {
                        System.out.println("Chưa có biên lai nào!");
                  } else {
                        for (BienLai bl : ds) {
                           bl.hienThi();
                        }
                  }
                  break;
               }
               case 3: {
                  System.out.println("Thoát chương trình!");
                  break;
               }
               default:
                  System.out.println("Lựa chọn không hợp lệ!");
            }
      } while (choice != 3);

      sc.close();
   }
}
