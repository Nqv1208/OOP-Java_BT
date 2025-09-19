package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
   private ArrayList<TaiLieu> danhSach = new ArrayList<>();
   private Scanner sc = new Scanner(System.in);

   // Nhập thông tin tài liệu mới
   public void nhapTaiLieu() {
      System.out.println("Chọn loại tài liệu: 1.Sách  2.Tạp chí  3.Báo");
      int loai = Integer.parseInt(sc.nextLine());

      System.out.print("Nhập mã tài liệu: ");
      String ma = sc.nextLine();
      System.out.print("Nhập tên nhà xuất bản: ");
      String nxb = sc.nextLine();
      System.out.print("Nhập số bản phát hành: ");
      int soBan = Integer.parseInt(sc.nextLine());

      TaiLieu tl = null;
      switch (loai) {
            case 1:
               System.out.print("Nhập tên tác giả: ");
               String tg = sc.nextLine();
               System.out.print("Nhập số trang: ");
               int soTrang = Integer.parseInt(sc.nextLine());
               tl = new Sach(ma, nxb, soBan, tg, soTrang);
               break;
            case 2:
               System.out.print("Nhập số phát hành: ");
               int soPh = Integer.parseInt(sc.nextLine());
               System.out.print("Nhập tháng phát hành: ");
               int thang = Integer.parseInt(sc.nextLine());
               tl = new TapChi(ma, nxb, soBan, soPh, thang);
               break;
            case 3:
               System.out.print("Nhập ngày phát hành: ");
               String ngay = sc.nextLine();
               tl = new Bao(ma, nxb, soBan, ngay);
               break;
      }
      if (tl != null) {
            danhSach.add(tl);
            System.out.println(">> Thêm tài liệu thành công!");
      }
   }

   // Tìm theo mã
   public void timTheoMa(String ma) {
      for (TaiLieu tl : danhSach) {
            if (tl.getMaTaiLieu().equalsIgnoreCase(ma)) {
               tl.hienThiThongTin();
               return;
            }
      }
      System.out.println("Không tìm thấy tài liệu với mã: " + ma);
   }

   // Tìm theo loại
   public void timTheoLoai(Class<?> loai) {
      for (TaiLieu tl : danhSach) {
            if (loai.isInstance(tl)) {
               tl.hienThiThongTin();
               System.out.println("-----------------");
            }
      }
   }

   // Hiển thị tất cả
   public void hienThiTatCa() {
      for (TaiLieu tl : danhSach) {
            tl.hienThiThongTin();
            System.out.println("-----------------");
      }
   }
}
