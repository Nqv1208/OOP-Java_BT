package Bai4;

public class ThiSinhKhoiA extends ThiSinh {
   private final String[] monThi = {"Toán", "Lý", "Hoá"};

   public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int uuTien) {
      super(soBaoDanh, hoTen, diaChi, uuTien);
   }

   @Override
   public void hienThiThongTin() {
      super.hienThiThongTin();
      System.out.println("Khối A - Môn thi: " + String.join(", ", monThi));
   }
}
