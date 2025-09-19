package Bai2;

public class CongNhan extends CanBo {
   private int bac; // bậc công nhân

   public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, int bac) {
      super(hoTen, ngaySinh, gioiTinh, diaChi);
      this.bac = bac;
   }

   public int getBac() {
      return bac;
   }
   public void setBac(int bac) {
      this.bac = bac;
   }

   @Override
   public void hienThi() {
      super.hienThi();
      System.out.println("Bậc: " + bac + "/7");
   }
}
