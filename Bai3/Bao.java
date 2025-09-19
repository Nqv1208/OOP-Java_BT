package Bai3;

public class Bao extends TaiLieu {
   private String ngayPhatHanh;

   public Bao(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
      super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
      this.ngayPhatHanh = ngayPhatHanh;
   }

   @Override
   public void hienThiThongTin() {
      super.hienThiThongTin();
      System.out.println("Ngày phát hành: " + ngayPhatHanh);
   }
}
