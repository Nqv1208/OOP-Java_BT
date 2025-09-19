package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
   private ArrayList<HoDan> danhSach = new ArrayList<>();

   public void nhap(Scanner sc) {
      System.out.print("Nhập số hộ dân trong khu phố: ");
      int n = Integer.parseInt(sc.nextLine());

      for (int i = 0; i < n; i++) {
            System.out.println("\n>>> Nhập thông tin hộ dân thứ " + (i + 1));
            HoDan ho = new HoDan();
            ho.nhap(sc);
            danhSach.add(ho);
      }
   }

   public void hienThiTatCa() {
      for (HoDan ho : danhSach) {
            ho.hienThi();
      }
   }

   public void hienThiThuongTho() {
      System.out.println("\n=== Các hộ có người mừng thượng thọ (≥80 tuổi) ===");
      for (HoDan ho : danhSach) {
            if (ho.coNguoiThuongTho()) {
               ho.hienThi();
            }
      }
   }
}
