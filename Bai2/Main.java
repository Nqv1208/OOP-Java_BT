package Bai2;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Mã sinh viên: 23115053122346
      QLCB ql_346 = new QLCB();
      Scanner sc = new Scanner(System.in);
      int chon;

      do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập cán bộ mới");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị tất cả cán bộ");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
               case 1:
                  ql_346.nhapCanBo();
                  break;
               case 2:
                  System.out.print("Nhập tên cần tìm: ");
                  String ten = sc.nextLine();
                  ql_346.timKiemTheoTen(ten);
                  break;
               case 3:
                  ql_346.hienThiTatCa();
                  break;
               case 0:
                  System.out.println("Thoát chương trình.");
                  break;
               default:
                  System.out.println("Chọn sai!");
            }
      } while (chon != 0);
   }
}
