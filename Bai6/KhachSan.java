package Bai6;

import java.util.ArrayList;

public class KhachSan {
   private ArrayList<KhachTro> danhSach;

   public KhachSan() {
      danhSach = new ArrayList<>();
   }

   // Thêm khách trọ
   public void themKhachTro(KhachTro k) {
      danhSach.add(k);
   }

   // Hiển thị danh sách khách trọ
   public void hienThiTatCa() {
      if (danhSach.isEmpty()) {
            System.out.println("Không có khách nào trong danh sách.");
            return;
      }
      for (KhachTro k : danhSach) {
            k.hienThi();
            System.out.println("-------------------");
      }
   }

   // Xóa khách trọ theo CMND
   public void xoaKhachTro(String soCMND) {
      danhSach.removeIf(k -> k.getSoCMND().equals(soCMND));
   }

   // Tính tiền cho khách trọ
   public void tinhTienKhachTro(String soCMND) {
      for (KhachTro k : danhSach) {
            if (k.getSoCMND().equals(soCMND)) {
               System.out.println("Tiền cần trả: " + k.tinhTien() + " VND");
               return;
            }
      }
      System.out.println("Không tìm thấy khách có CMND: " + soCMND);
   }
}
