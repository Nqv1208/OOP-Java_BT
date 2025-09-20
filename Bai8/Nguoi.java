package Bai8;

import java.util.Scanner;

public class Nguoi {
	// Thuộc tính
	protected String hoTen;
	protected String ngaySinh;
	protected String queQuan;

	public Nguoi() {	}

	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
	}

	// Phương thức nhập thông tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan = sc.nextLine();
	}

	// Phương thức hiển thị thông tin
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen);
		System.out.println("\tNgay sinh: " + ngaySinh);
		System.out.println("\tQue quan: " + queQuan);
	}
}
