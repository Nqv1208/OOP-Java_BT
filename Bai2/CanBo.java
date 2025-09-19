package Bai2;

public class CanBo {
   private String hoTen;
   private String ngaySinh;
   private String gioiTinh;
   private String diaChi;

   public CanBo() {}

   public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
      this.hoTen = hoTen;
      this.ngaySinh = ngaySinh;
      this.gioiTinh = gioiTinh;
      this.diaChi = diaChi;
   }

   // Getter & Setter
   public String getHoTen() {
      return hoTen;
   }
   public void setHoTen(String hoTen) {
      this.hoTen = hoTen;
   }
   public String getNgaySinh() {
      return ngaySinh;
   }
   public void setNgaySinh(String ngaySinh) {
      this.ngaySinh = ngaySinh;
   }
   public String getGioiTinh() {
      return gioiTinh;
   }
   public void setGioiTinh(String gioiTinh) {
      this.gioiTinh = gioiTinh;
   }
   public String getDiaChi() {
      return diaChi;
   }
   public void setDiaChi(String diaChi) {
      this.diaChi = diaChi;
   }

   public void hienThi() {
      System.out.println("Họ tên: " + hoTen);
      System.out.println("Ngày sinh: " + ngaySinh);
      System.out.println("Giới tính: " + gioiTinh);
      System.out.println("Địa chỉ: " + diaChi);
   }
}
