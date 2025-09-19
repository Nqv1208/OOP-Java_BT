package Bai1;

public class Main {
   public static void main(String[] args) {
      PhanSo ps1 = new PhanSo(2, 3);
      PhanSo ps2 = new PhanSo(4, 5);

      System.out.println("Phân số 1: " + ps1);
      System.out.println("Phân số 2: " + ps2);

      PhanSo spTong = ps1.congPS(ps2);
      System.out.println("Tổng: " + spTong);

      System.out.println("Hiệu: " + ps1.truPS(ps2));
      System.out.println("Tích: " + ps1.nhanPS(ps2));
      System.out.println("Thương: " + ps1.chiaPS(ps2));

      System.out.println("Phân số 1 có tối giản? " + ps1.isToiGian());
      System.out.println("Phân số 2 có tối giản? " + ps2.isToiGian());
   }
}
