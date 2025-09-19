package Bai10;

import java.util.Scanner;

public class BienLai {
   private KhachHang khachHang;
   private int chiSoCu;
   private int chiSoMoi;
   private double soTienPhaiTra;

   public void nhap(Scanner sc) {
      khachHang = new KhachHang();
      System.out.println("== Nhập thông tin khách hàng ==");
      khachHang.nhap(sc);

      System.out.print("Nhập chỉ số cũ: ");
      chiSoCu = Integer.parseInt(sc.nextLine());
      System.out.print("Nhập chỉ số mới: ");
      chiSoMoi = Integer.parseInt(sc.nextLine());

      tinhTien();
   }

   private void tinhTien() {
      soTienPhaiTra = (chiSoMoi - chiSoCu) * 750;
   }

   public void hienThi() {
      khachHang.hienThi();
      System.out.println("Chỉ số cũ: " + chiSoCu);
      System.out.println("Chỉ số mới: " + chiSoMoi);
      System.out.println("Số tiền phải trả: " + soTienPhaiTra + " VND");
      System.out.println("----------------------------");
   }
}
