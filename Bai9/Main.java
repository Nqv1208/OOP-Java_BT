package Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Mã sinh viên: 23115053122346
      Scanner sc = new Scanner(System.in);
      ArrayList<TheMuon> ds_346 = new ArrayList<>();

      int choice;
      do {
            System.out.println("\n===== MENU QUẢN LÝ THẺ MƯỢN =====");
            System.out.println("1. Nhập danh sách thẻ mượn");
            System.out.println("2. Hiển thị toàn bộ thẻ mượn");
            System.out.println("3. Hiển thị sinh viên cần trả sách cuối tháng");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
               case 1: {
                  System.out.print("Nhập số lượng thẻ mượn: ");
                  int n = Integer.parseInt(sc.nextLine());
                  for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Nhập thẻ mượn thứ " + (i + 1) + " ---");
                        TheMuon tm = new TheMuon();
                        tm.nhap(sc);
                        ds_346.add(tm);
                  }
                  break;
               }
               case 2: {
                  System.out.println("\n=== DANH SÁCH THẺ MƯỢN ===");
                  for (TheMuon tm : ds_346) {
                        tm.hienThi();
                  }
                  break;
               }
               case 3: {
                  System.out.println("\n=== DANH SÁCH TRẢ SÁCH CUỐI THÁNG ===");
                  for (TheMuon tm : ds_346) {
                        String hanTra = tm.getHanTra();
                        if (hanTra.startsWith("30/") || hanTra.startsWith("31/")) {
                           System.out.println("Sinh viên cần trả sách cuối tháng:");
                           tm.getSinhVien().hienThi();
                           System.out.println("Sách mượn (số hiệu): " + tm.getSoHieuSach());
                           System.out.println("----------------------------");
                        }
                  }
                  break;
               }
               case 4: {
                  System.out.println("Thoát chương trình!");
                  break;
               }
               default:
                  System.out.println("Lựa chọn không hợp lệ!");
            }
      } while (choice != 4);

      sc.close();
   }
}
