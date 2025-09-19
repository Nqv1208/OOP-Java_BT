package Bai5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Nguoi {
   private String hoTen;
   private String ngaySinh;  // định dạng dd/MM/yyyy
   private String ngheNghiep;

   public void nhap(Scanner sc) {
      System.out.print("Nhập họ tên: ");
      hoTen = sc.nextLine();
      System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
      ngaySinh = sc.nextLine();
      System.out.print("Nhập nghề nghiệp: ");
      ngheNghiep = sc.nextLine();
   }

   public void hienThi() {
      System.out.println("Họ tên: " + hoTen);
      System.out.println("Ngày sinh: " + ngaySinh);
      System.out.println("Nghề nghiệp: " + ngheNghiep);
      System.out.println("Tuổi: " + tinhTuoi());
   }

   public int tinhTuoi() {
      try {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate birth = LocalDate.parse(ngaySinh, fmt);
            return Period.between(birth, LocalDate.now()).getYears();
      } catch (Exception e) {
            return -1; // lỗi định dạng
      }
   }

   public boolean isThuongTho() {
      return tinhTuoi() >= 80;
   }
}
