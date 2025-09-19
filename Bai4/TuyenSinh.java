package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
   private ArrayList<ThiSinh> danhSach = new ArrayList<>();
   private Scanner sc = new Scanner(System.in);

   // Nhập thí sinh
   public void nhapThiSinh() {
      System.out.println("Chọn khối thi: 1.Khối A  2.Khối B  3.Khối C");
      int chon = Integer.parseInt(sc.nextLine());

      System.out.print("Nhập số báo danh: ");
      String sbd = sc.nextLine();
      System.out.print("Nhập họ tên: ");
      String ten = sc.nextLine();
      System.out.print("Nhập địa chỉ: ");
      String diaChi = sc.nextLine();
      System.out.print("Nhập diện ưu tiên: ");
      int uuTien = Integer.parseInt(sc.nextLine());

      ThiSinh ts = null;
      switch (chon) {
            case 1:
               ts = new ThiSinhKhoiA(sbd, ten, diaChi, uuTien);
               break;
            case 2:
               ts = new ThiSinhKhoiB(sbd, ten, diaChi, uuTien);
               break;
            case 3:
               ts = new ThiSinhKhoiC(sbd, ten, diaChi, uuTien);
               break;
      }
      if (ts != null) {
            danhSach.add(ts);
            System.out.println(">> Đã thêm thí sinh thành công!");
      }
   }

   // Hiển thị tất cả thí sinh
   public void hienThiTatCa() {
      for (ThiSinh ts : danhSach) {
            ts.hienThiThongTin();
            System.out.println("--------------------");
      }
   }

   // Tìm kiếm theo số báo danh
   public void timTheoSoBaoDanh(String sbd) {
      for (ThiSinh ts : danhSach) {
            if (ts.getSoBaoDanh().equalsIgnoreCase(sbd)) {
               ts.hienThiThongTin();
               return;
            }
      }
      System.out.println("Không tìm thấy thí sinh có số báo danh: " + sbd);
   } 
}
