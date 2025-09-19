package Bai4;

public class ThiSinh {
   protected String soBaoDanh;
   protected String hoTen;
   protected String diaChi;
   protected int uuTien;

   public ThiSinh(String soBaoDanh, String hoTen, String diaChi, int uuTien) {
      this.soBaoDanh = soBaoDanh;
      this.hoTen = hoTen;
      this.diaChi = diaChi;
      this.uuTien = uuTien;
   }

   public String getSoBaoDanh() {
      return soBaoDanh;
   }

   public void hienThiThongTin() {
      System.out.println("Số báo danh: " + soBaoDanh);
      System.out.println("Họ tên: " + hoTen);
      System.out.println("Địa chỉ: " + diaChi);
      System.out.println("Diện ưu tiên: " + uuTien);
   }
}
