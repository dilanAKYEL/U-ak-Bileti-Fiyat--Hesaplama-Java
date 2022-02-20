import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int mesafe, secim, yas;
        double tutar = 0;

        System.out.print("Yaşınızı Giriniz:");
        yas = input.nextInt();
        System.out.print("Km Giriniz:");
        mesafe = input.nextInt();
        System.out.print("Yolculuk Tipi Seçiniz : 1-Tek yön , 2 -Gidiş/Dönüş ");
        secim = input.nextInt();

        if (yas < 0 || mesafe < 0 || (secim < 1 || secim > 2)) {
            System.out.println("Hatalı giriş yaptınız!");

        } else {
            tutar = mesafe / 10;
            if (yas < 12) {
                tutar = tutar / 2;

            } else if (yas >= 12 || yas <= 24) {
                tutar = tutar / 10;
            } else if (yas > 65) {
                tutar = tutar * 3 / 10;
            } else {
                tutar = tutar;
            }
        }
        if (secim == 2) {
            System.out.println("Toplam tutar: " + (tutar / 5) + " TL");
        } else if (secim == 1) {
            System.out.println("Toplam tutar: " + tutar * 10 + " TL");
        }
    }
}
