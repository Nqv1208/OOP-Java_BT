package Bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<HSHocSinh> danhSach = new ArrayList<>();
      int choice;

      do {
            System.out.println("\n===== MENU QUẢN LÝ HỒ SƠ HỌC SINH =====");
            System.out.println("1. Nhập danh sách học sinh");
            System.out.println("2. Hiển thị toàn bộ danh sách học sinh");
            System.out.println("3. Hiển thị học sinh sinh năm 1985 và quê ở Thái Nguyên");
            System.out.println("4. Hiển thị học sinh lớp 10A1");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
               case 1:
                  System.out.print("Nhập số lượng học sinh: ");
                  int n = Integer.parseInt(sc.nextLine());
                  for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Nhập thông tin học sinh thứ " + (i + 1) + " ---");
                        HSHocSinh hs = new HSHocSinh();
                        hs.nhap(sc);
                        danhSach.add(hs);
                  }
                  break;

               case 2:
                  System.out.println("\n=== DANH SÁCH TOÀN BỘ HỌC SINH ===");
                  if (danhSach.isEmpty()) {
                        System.out.println("Chưa có dữ liệu!");
                  } else {
                        for (HSHocSinh hs : danhSach) {
                           hs.hienThi();
                        }
                  }
                  break;

               case 3:
                  System.out.println("\n=== Học sinh sinh năm 1985 và quê ở Thái Nguyên ===");
                  boolean found1985 = false;
                  for (HSHocSinh hs : danhSach) {
                        if (hs.getNgaySinh().endsWith("1985")
                              && hs.getQueQuan().equalsIgnoreCase("Thái Nguyên")) {
                           hs.hienThi();
                           found1985 = true;
                        }
                  }
                  if (!found1985) {
                        System.out.println("Không tìm thấy học sinh nào!");
                  }
                  break;

               case 4:
                  System.out.println("\n=== Học sinh lớp 10A1 ===");
                  boolean found10A1 = false;
                  for (HSHocSinh hs : danhSach) {
                        if (hs.getLop().equalsIgnoreCase("10A1")) {
                           hs.hienThi();
                           found10A1 = true;
                        }
                  }
                  if (!found10A1) {
                        System.out.println("Không có học sinh lớp 10A1!");
                  }
                  break;

               case 5:
                  System.out.println("Thoát chương trình.");
                  break;

               default:
                  System.out.println("Lựa chọn không hợp lệ!");
            }
      } while (choice != 5);

      sc.close();
   }
}
