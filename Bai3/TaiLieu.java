package Bai3;

public class TaiLieu {
   protected String maTaiLieu;
   protected String nhaXuatBan;
   protected int soBanPhatHanh;

   public TaiLieu(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
      this.maTaiLieu = maTaiLieu;
      this.nhaXuatBan = nhaXuatBan;
      this.soBanPhatHanh = soBanPhatHanh;
   }

   public String getMaTaiLieu() {
      return maTaiLieu;
   }

   public void hienThiThongTin() {
      System.out.println("Mã tài liệu: " + maTaiLieu);
      System.out.println("Nhà xuất bản: " + nhaXuatBan);
      System.out.println("Số bản phát hành: " + soBanPhatHanh);
   }
}
