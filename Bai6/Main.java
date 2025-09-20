package Bai6;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Mã sinh viên: 23115053122346
      Scanner sc = new Scanner(System.in);
      KhachSan ks_346 = new KhachSan();
      int choice;

      do {
            System.out.println("\n===== MENU QUẢN LÝ KHÁCH SẠN =====");
            System.out.println("1. Nhập thêm khách trọ");
            System.out.println("2. Hiển thị danh sách khách trọ");
            System.out.println("3. Tính tiền khách trọ theo CMND");
            System.out.println("4. Xóa khách trọ theo CMND");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
               case 1:
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
                  ks_346.themKhachTro(khach);
                  System.out.println(">>> Thêm khách thành công!");
                  break;

               case 2:
                  System.out.println("\n=== DANH SÁCH KHÁCH TRỌ ===");
                  ks_346.hienThiTatCa();
                  break;

               case 3:
                  System.out.print("Nhập CMND khách cần tính tiền: ");
                  String cmnd = sc.nextLine();
                  ks_346.tinhTienKhachTro(cmnd);
                  break;

               case 4:
                  System.out.print("Nhập CMND khách cần xóa: ");
                  String cmndXoa = sc.nextLine();
                  ks_346.xoaKhachTro(cmndXoa);
                  System.out.println(">>> Xóa xong!");
                  break;

               case 5:
                  System.out.println("Thoát chương trình.");
                  break;

               default:
                  System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
      } while (choice != 5);

      sc.close();
   }
}
