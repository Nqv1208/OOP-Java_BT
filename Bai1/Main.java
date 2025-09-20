package Bai1;

public class Main {
   public static void main(String[] args) {
      PhanSo ps1_346 = new PhanSo(2, 3);
      PhanSo ps2_346 = new PhanSo(4, 5);

      System.out.println("Phân số 1: " + ps1_346);
      System.out.println("Phân số 2: " + ps2_346);

      PhanSo spTong = ps1_346.congPS(ps2_346);
      System.out.println("Tổng: " + spTong);

      System.out.println("Hiệu: " + ps1_346.truPS(ps2_346));
      System.out.println("Tích: " + ps1_346.nhanPS(ps2_346));
      System.out.println("Thương: " + ps1_346.chiaPS(ps2_346));

      System.out.println("Phân số 1 có tối giản? " + ps1_346.isToiGian());
      System.out.println("Phân số 2 có tối giản? " + ps2_346.isToiGian());
   }
}
