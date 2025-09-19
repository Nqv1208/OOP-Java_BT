package Bai3;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      QuanLySach ql = new QuanLySach();
      Scanner sc = new Scanner(System.in);
      int chon;
      do {
            System.out.println("--- MENU ---");
            System.out.println("1. Nhập tài liệu mới");
            System.out.println("2. Tìm tài liệu theo mã");
            System.out.println("3. Tìm tài liệu theo loại");
            System.out.println("4. Hiển thị tất cả tài liệu");
            System.out.println("0. Thoát");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
               case 1:
                  ql.nhapTaiLieu();
                  break;
               case 2:
                  System.out.print("Nhập mã tài liệu cần tìm: ");
                  String ma = sc.nextLine();
                  ql.timTheoMa(ma);
                  break;
               case 3:
                  System.out.println("Chọn loại: 1.Sách  2.Tạp chí  3.Báo");
                  int loai = Integer.parseInt(sc.nextLine());
                  if (loai == 1) ql.timTheoLoai(Sach.class);
                  else if (loai == 2) ql.timTheoLoai(TapChi.class);
                  else if (loai == 3) ql.timTheoLoai(Bao.class);
                  break;
               case 4:
                  ql.hienThiTatCa();
                  break;
            }
      } while (chon != 0);
   }
}
