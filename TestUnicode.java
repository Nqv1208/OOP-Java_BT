import java.io.BufferedReader;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.util.Scanner;

public class TestUnicode {
    public static void main(String[] args) {
        // Đặt system property cho encoding
        System.setProperty("file.encoding", "UTF-8");
        System.setProperty("console.encoding", "UTF-8");
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();

        System.out.println("Trước normalize: " + diaChi);
        System.out.println("Sau normalize: " +
                Normalizer.normalize(diaChi, Normalizer.Form.NFC));

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in, StandardCharsets.UTF_8));
        try {
            System.out.print("Nhập địa chỉ (BufferedReader): ");
            String diaChi2 = br.readLine();
            System.out.println("Địa chỉ đã nhập: " + diaChi2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
