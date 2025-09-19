package Bai1;
// Lớp PhanSo
public class PhanSo {
    private int tuSo;
    private int mauSo;

    // ConstruPSctor mặc định
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    // ConstruPSctor có tham số
    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        rutGon();
    }

    // Getter
    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    // Tìm ước số chung lớn nhất (GCD)
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Rút gọn phân số
    public void rutGon() {
        int gcd = gcd(Math.abs(tuSo), Math.abs(mauSo));
        tuSo /= gcd;
        mauSo /= gcd;

        // Nếu mẫu số âm thì chuyển dấu sang tử số
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    // Kiểm tra phân số có tối giản không
    public boolean isToiGian() {
        return gcd(Math.abs(tuSo), Math.abs(mauSo)) == 1;
    }

    // Các phép toán
    public PhanSo congPS(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau);
    }

    public PhanSo truPS(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau);
    }

    public PhanSo nhanPS(PhanSo ps) {
        int tu = this.tuSo * ps.tuSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau);
    }

    public PhanSo chiaPS(PhanSo ps) {
        if (ps.tuSo == 0) {
            throw new ArithmeticException("Không thể chiaPS cho 0");
        }
        int tu = this.tuSo * ps.mauSo;
        int mau = this.mauSo * ps.tuSo;
        return new PhanSo(tu, mau);
    }

    // Hiển thị phân số
    @Override
    public String toString() {
        if (mauSo == 1) return String.valueOf(tuSo);
        return tuSo + "/" + mauSo;
    }
}