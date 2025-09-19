package Bai6;

public class KhachTro {
   private Nguoi nguoi;
   private int soNgayTro;
   private String loaiPhong;
   private double giaPhong;

   public KhachTro(Nguoi nguoi, int soNgayTro, String loaiPhong, double giaPhong) {
      this.nguoi = nguoi;
      this.soNgayTro = soNgayTro;
      this.loaiPhong = loaiPhong;
      this.giaPhong = giaPhong;
   }

   public String getSoCMND() {
      return nguoi.getSoCMND();
   }

   public double tinhTien() {
      return soNgayTro * giaPhong;
   }

   public void hienThi() {
      nguoi.hienThi();
      System.out.println("Loại phòng: " + loaiPhong + 
                           ", Giá phòng/ngày: " + giaPhong + 
                           ", Số ngày trọ: " + soNgayTro);
   }
}
