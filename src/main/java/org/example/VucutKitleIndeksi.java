import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        // Scanner sınıfını kullanarak kullanıcıdan veri alma
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan boy ve kilo bilgilerini alıyoruz
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        // Vücut Kitle İndeksi hesaplama formülü
        double vki = kilo / (boy * boy);

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Vücut Kitle İndeksiniz: " + vki);

        // Kaynakları kapatıyoruz
        scanner.close();
    }
}
