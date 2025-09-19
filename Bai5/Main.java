package Bai5;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      KhuPho kp = new KhuPho();
      kp.nhap(sc);

      System.out.println("\n--- DANH SÁCH TOÀN BỘ HỘ DÂN ---");
      kp.hienThiTatCa();

      System.out.println("\n--- DANH SÁCH HỘ CÓ NGƯỜI ≥ 80 TUỔI ---");
      kp.hienThiThuongTho();
   }
}