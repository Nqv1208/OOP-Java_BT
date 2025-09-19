package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
   private List<CanBo> danhSach = new ArrayList<>();
   private Scanner sc = new Scanner(System.in);

   // Nhập cán bộ mới
   public void nhapCanBo() {
      System.out.println("Chọn loại cán bộ: 1.Công nhân  2.Kỹ sư  3.Nhân viên");
      int loai = Integer.parseInt(sc.nextLine());

      System.out.print("Nhập họ tên: ");
      String hoTen = sc.nextLine();
      System.out.print("Nhập ngày sinh: ");
      String ngaySinh = sc.nextLine();
      System.out.print("Nhập giới tính: ");
      String gioiTinh = sc.nextLine();
      System.out.print("Nhập địa chỉ: ");
      String diaChi = sc.nextLine();

      switch (loai) {
            case 1:
               System.out.print("Nhập bậc (1-7): ");
               int bac = Integer.parseInt(sc.nextLine());
               danhSach.add(new CongNhan(hoTen, ngaySinh, gioiTinh, diaChi, bac));
               break;
            case 2:
               System.out.print("Nhập ngành đào tạo: ");
               String nganh = sc.nextLine();
               danhSach.add(new KySu(hoTen, ngaySinh, gioiTinh, diaChi, nganh));
               break;
            case 3:
               System.out.print("Nhập công việc: ");
               String cv = sc.nextLine();
               danhSach.add(new NhanVien(hoTen, ngaySinh, gioiTinh, diaChi, cv));
               break;
            default:
               System.out.println("Lựa chọn không hợp lệ!");
      }
   }

   // Tìm kiếm theo họ tên
   public void timKiemTheoTen(String ten) {
      boolean found = false;
      for (CanBo cb : danhSach) {
            if (cb.getHoTen().equalsIgnoreCase(ten)) {
               cb.hienThi();
               System.out.println("------------------");
               found = true;
            }
      }
      if (!found) {
            System.out.println("Không tìm thấy cán bộ nào tên: " + ten);
      }
   }

   // Hiển thị tất cả
   public void hienThiTatCa() {
      for (CanBo cb : danhSach) {
            cb.hienThi();
            System.out.println("------------------");
      }
   }
}
