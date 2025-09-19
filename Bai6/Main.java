package Bai6;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      KhachSan ks = new KhachSan();

      System.out.print("Nhập số lượng khách trọ: ");
      int n = Integer.parseInt(sc.nextLine());

      for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin khách trọ thứ " + (i + 1));
            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaySinh = sc.nextLine();
            System.out.print("CMND: ");
            String soCMND = sc.nextLine();

            System.out.print("Số ngày trọ: ");
            int soNgayTro = Integer.parseInt(sc.nextLine());
            System.out.print("Loại phòng: ");
            String loaiPhong = sc.nextLine();
            System.out.print("Giá phòng/ngày: ");
            double giaPhong = Double.parseDouble(sc.nextLine());

            Nguoi nguoi = new Nguoi(hoTen, ngaySinh, soCMND);
            KhachTro khach = new KhachTro(nguoi, soNgayTro, loaiPhong, giaPhong);
            ks.themKhachTro(khach);
      }

      System.out.println("\n=== DANH SÁCH KHÁCH TRỌ ===");
      ks.hienThiTatCa();

      System.out.print("\nNhập CMND khách cần tính tiền: ");
      String cmnd = sc.nextLine();
      ks.tinhTienKhachTro(cmnd);

      System.out.print("\nNhập CMND khách cần xóa: ");
      String cmndXoa = sc.nextLine();
      ks.xoaKhachTro(cmndXoa);

      System.out.println("\n=== DANH SÁCH KHÁCH TRỌ SAU KHI XÓA ===");
      ks.hienThiTatCa();

      sc.close();
   }
}