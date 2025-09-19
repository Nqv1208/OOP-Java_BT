package Bai7;

import java.util.Scanner;

public class Nguoi {
   protected String hoTen;
   protected String ngaySinh; // dd/MM/yyyy
   protected String queQuan;

   public void nhap(Scanner sc) {
      System.out.print("Nhập họ tên: ");
      hoTen = sc.nextLine();
      System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
      ngaySinh = sc.nextLine();
      System.out.print("Nhập quê quán: ");
      queQuan = sc.nextLine();
   }

   public void hienThi() {
      System.out.println("Họ tên: " + hoTen);
      System.out.println("Ngày sinh: " + ngaySinh);
      System.out.println("Quê quán: " + queQuan);
   }

   public String getNgaySinh() {
      return ngaySinh;
   }

   public String getQueQuan() {
      return queQuan;
   }
}
