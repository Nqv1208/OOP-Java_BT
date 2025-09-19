package Bai4;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      TuyenSinh ts = new TuyenSinh();
      Scanner sc = new Scanner(System.in);
      int chon;

      do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập thí sinh mới");
            System.out.println("2. Hiển thị tất cả thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
               case 1:
                  ts.nhapThiSinh();
                  break;
               case 2:
                  ts.hienThiTatCa();
                  break;
               case 3:
                  System.out.print("Nhập số báo danh cần tìm: ");
                  String sbd = sc.nextLine();
                  ts.timTheoSoBaoDanh(sbd);
                  break;
            }
      } while (chon != 0);
   }
}
