package Bai10;

import java.util.Scanner;

public class KhachHang {
   private String hoTen;
   private String soNha;
   private String maCongTo;

   public void nhap(Scanner sc) {
      System.out.print("Nhập họ tên chủ hộ: ");
      hoTen = sc.nextLine();
      System.out.print("Nhập số nhà: ");
      soNha = sc.nextLine();
      System.out.print("Nhập mã số công tơ: ");
      maCongTo = sc.nextLine();
   }

   public void hienThi() {
      System.out.println("Họ tên chủ hộ: " + hoTen);
      System.out.println("Số nhà: " + soNha);
      System.out.println("Mã công tơ: " + maCongTo);
   }
}
