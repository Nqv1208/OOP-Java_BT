package Bai9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	private String soPhieuMuon;
	private String ngayMuon;
	private String hanTra;
	private String soHieuSach;
	private SinhVien sv;

	public void nhap(Scanner sc) {
		System.out.print("Nhập số phiếu mượn: ");
		soPhieuMuon = sc.nextLine();
		System.out.print("Nhập ngày mượn: ");
		ngayMuon = sc.nextLine();
		System.out.print("Nhập hạn trả (dd/MM/yyyy): ");
		hanTra = sc.nextLine();
		System.out.print("Nhập số hiệu sách: ");
		soHieuSach = sc.nextLine();

		// Nhập thông tin sinh viên
		sv = new SinhVien();
		System.out.println("== Nhập thông tin sinh viên ==");
		sv.nhap(sc);
	}

	public void hienThi() {
		System.out.println("Số phiếu mượn: " + soPhieuMuon);
		System.out.println("Ngày mượn: " + ngayMuon);
		System.out.println("Hạn trả: " + hanTra);
		System.out.println("Số hiệu sách: " + soHieuSach);
		sv.hienThi();
		System.out.println("----------------------------");
	}

	public String getHanTra() {
		return hanTra;
	}

	public String getSoHieuSach() {
		return soHieuSach;
	}

	public SinhVien getSinhVien() {
		return sv;
	}
}
