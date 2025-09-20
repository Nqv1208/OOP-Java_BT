package Bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Mã sinh viên: 23115053122346
      Scanner sc = new Scanner(System.in);
      ArrayList<CBGV> danhSach_346 = new ArrayList<>();

      int chon;
      do {
            System.out.println("\n===== MENU QUẢN LÝ CBGV =====");
            System.out.println("1. Nhập danh sách CBGV");
            System.out.println("2. Hiển thị toàn bộ danh sách");
            System.out.println("3. Hiển thị CBGV có lương >= 8 triệu");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
               case 1:
                  System.out.print("Nhập số lượng CBGV: ");
                  int n = Integer.parseInt(sc.nextLine());
                  for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Nhập thông tin CBGV thứ " + (i + 1) + " ---");
                        CBGV gv = new CBGV();
                        gv.nhapThongTin(sc);
                        danhSach_346.add(gv);
                  }
                  break;

               case 2:
                  System.out.println("\n=== DANH SÁCH CBGV ===");
                  for (CBGV gv : danhSach_346) {
                        gv.hienThiThongTin();
                  }
                  break;

               case 3:
                  System.out.println("\n=== CBGV CÓ LƯƠNG >= 8 TRIỆU ===");
                  for (CBGV gv : danhSach_346) {
                        if (gv.getLuongThucLinh() >= 8000000) {
                           gv.hienThiThongTin();
                        }
                  }
                  break;

               case 0:
                  System.out.println("Thoát chương trình!");
                  break;

               default:
                  System.out.println("Lựa chọn không hợp lệ!");
            }
      } while (chon != 0);

      sc.close();
   }
}

