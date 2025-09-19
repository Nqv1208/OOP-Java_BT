package Bai2;

public class NhanVien extends CanBo {
   private String congViec;

   public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
      super(hoTen, ngaySinh, gioiTinh, diaChi);
      this.congViec = congViec;
   }

   public String getCongViec() {
      return congViec;
   }
   public void setCongViec(String congViec) {
      this.congViec = congViec;
   }

   @Override
   public void hienThi() {
      super.hienThi();
      System.out.println("Công việc: " + congViec);
   }
}