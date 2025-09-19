package Bai3;

public class TapChi extends TaiLieu {
   private int soPhatHanh;
   private int thangPhatHanh;

   public TapChi(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
      super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
      this.soPhatHanh = soPhatHanh;
      this.thangPhatHanh = thangPhatHanh;
   }

   @Override
   public void hienThiThongTin() {
      super.hienThiThongTin();
      System.out.println("Số phát hành: " + soPhatHanh);
      System.out.println("Tháng phát hành: " + thangPhatHanh);
   }
}
