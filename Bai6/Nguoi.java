package Bai6;

public class Nguoi {
   private String hoTen;
   private String ngaySinh;
   private String soCMND;

   public Nguoi(String hoTen, String ngaySinh, String soCMND) {
      this.hoTen = hoTen;
      this.ngaySinh = ngaySinh;
      this.soCMND = soCMND;
   }

   public String getSoCMND() {
      return soCMND;
   }

   public void hienThi() {
      System.out.println("Họ tên: " + hoTen + 
                           ", Ngày sinh: " + ngaySinh + 
                           ", CMND: " + soCMND);
   }
}
