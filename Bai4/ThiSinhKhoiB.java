package Bai4;

public class ThiSinhKhoiB extends ThiSinh {
   private final String[] monThi = {"Toán", "Hoá", "Sinh"};

   public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int uuTien) {
      super(soBaoDanh, hoTen, diaChi, uuTien);
   }

   @Override
   public void hienThiThongTin() {
      super.hienThiThongTin();
      System.out.println("Khối B - Môn thi: " + String.join(", ", monThi));
   }
}
