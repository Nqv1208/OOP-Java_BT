package Bai9;

import java.util.Scanner;

public class SinhVien {
   private String hoTen;
   private String maSV;
   private String ngaySinh;
   private String lop;

   public void nhap(Scanner sc) {
      System.out.print("Nhập họ tên sinh viên: ");
      hoTen = sc.nextLine();
      System.out.print("Nhập mã SV: ");
      maSV = sc.nextLine();
      System.out.print("Nhập ngày sinh: ");
      ngaySinh = sc.nextLine();
      System.out.print("Nhập lớp: ");
      lop = sc.nextLine();
   }

   public void hienThi() {
      System.out.println("Họ tên: " + hoTen);
      System.out.println("Mã SV: " + maSV);
      System.out.println("Ngày sinh: " + ngaySinh);
      System.out.println("Lớp: " + lop);
   }
}
