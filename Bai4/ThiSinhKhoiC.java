package Bai4;

public class ThiSinhKhoiC extends ThiSinh {
   private final String[] monThi = {"Văn", "Sử", "Địa"};

   public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, int uuTien) {
      super(soBaoDanh, hoTen, diaChi, uuTien);
   }

   @Override
   public void hienThiThongTin() {
      super.hienThiThongTin();
      System.out.println("Khối C - Môn thi: " + String.join(", ", monThi));
   }
}
