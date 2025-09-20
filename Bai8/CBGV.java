package Bai8;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// Thuộc tính
	private double luongCung;
	private double thuong;
	private double phat;
	private double luongThucLinh;

	public CBGV() {}

	// Phương thức nhập thông tin
	@Override
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat = sc.nextDouble();
		sc.nextLine();

		luongThucLinh = luongCung + thuong - phat;
	}

	// Phương thức hiển thị thông tin
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung);
		System.out.println("\tThuong: " + thuong);
		System.out.println("\tPhat: " + phat);
		System.out.println("\tLuong thuc linh: " + luongThucLinh);
	}

	// Phương thức lấy ra thông tin về lương thực lĩnh
	public double getLuongThucLinh() {
		return luongThucLinh;
	}
}
