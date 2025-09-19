package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class HoDan {
   private int soNha;
   private ArrayList<Nguoi> thanhVien = new ArrayList<>();

   public void nhap(Scanner sc) {
      System.out.print("Nhập số nhà: ");
      soNha = Integer.parseInt(sc.nextLine());

      System.out.print("Nhập số thành viên: ");
      int soTV = Integer.parseInt(sc.nextLine());

      for (int i = 0; i < soTV; i++) {
            System.out.println(">> Nhập thông tin thành viên " + (i + 1));
            Nguoi n = new Nguoi();
            n.nhap(sc);
            thanhVien.add(n);
      }
   }

   public void hienThi() {
      System.out.println("===== Hộ dân số nhà: " + soNha + " =====");
      for (Nguoi n : thanhVien) {
            n.hienThi();
            System.out.println("---------------------");
      }
   }

   public boolean coNguoiThuongTho() {
      for (Nguoi n : thanhVien) {
            if (n.isThuongTho()) return true;
      }
      return false;
   }
}
