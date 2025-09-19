package Bai3;

public class Sach extends TaiLieu {
   private String tenTacGia;
   private int soTrang;

   public Sach(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
      super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
      this.tenTacGia = tenTacGia;
      this.soTrang = soTrang;
   }

   @Override
   public void hienThiThongTin() {
      super.hienThiThongTin();
      System.out.println("Tác giả: " + tenTacGia);
      System.out.println("Số trang: " + soTrang);
   }
}
