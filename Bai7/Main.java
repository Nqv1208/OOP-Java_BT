package Bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<HSHocSinh> danhSach = new ArrayList<>();

      System.out.print("Nhập số lượng học sinh: ");
      int n = Integer.parseInt(sc.nextLine());

      for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập thông tin học sinh thứ " + (i + 1) + " ---");
            HSHocSinh hs = new HSHocSinh();
            hs.nhap(sc);
            danhSach.add(hs);
      }

      // 1. Hiển thị học sinh sinh năm 1985 và quê ở Thái Nguyên
      System.out.println("\n=== Học sinh sinh năm 1985 và quê ở Thái Nguyên ===");
      for (HSHocSinh hs : danhSach) {
            if (hs.getNgaySinh().endsWith("1985") && 
               hs.getQueQuan().equalsIgnoreCase("Thái Nguyên")) {
               hs.hienThi();
            }
      }

      // 2. Hiển thị học sinh lớp 10A1
      System.out.println("\n=== Học sinh lớp 10A1 ===");
      for (HSHocSinh hs : danhSach) {
            if (hs.getLop().equalsIgnoreCase("10A1")) {
               hs.hienThi();
            }
      }

      sc.close();
   }
}