package Bai7;

import java.util.Scanner;

public class HSHocSinh extends Nguoi {
   private String lop;
   private String khoaHoc;
   private String kyHoc;

   public void nhap(Scanner sc) {
      super.nhap(sc);
      System.out.print("Nhập lớp: ");
      lop = sc.nextLine();
      System.out.print("Nhập khóa học: ");
      khoaHoc = sc.nextLine();
      System.out.print("Nhập kỳ học: ");
      kyHoc = sc.nextLine();
   }

   @Override
   public void hienThi() {
      super.hienThi();
      System.out.println("Lớp: " + lop);
      System.out.println("Khóa học: " + khoaHoc);
      System.out.println("Kỳ học: " + kyHoc);
      System.out.println("---------------------------");
   }

   public String getLop() {
      return lop;
   }
}
