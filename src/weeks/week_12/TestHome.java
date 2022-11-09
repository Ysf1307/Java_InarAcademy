package weeks.week_12;

import java.util.Scanner;

public class TestHome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Yüzölüçümü giriniz:");
        double yuzOlcumu = input.nextDouble();
        System.out.println("Banyo sayısını giriniz:");
        int banyoSayisi = input.nextInt();
        System.out.println("Oda sayısını giriniz:");
        int odaSayisi = input.nextInt();
        System.out.println("Garajı var mı?:");
        boolean garajiVar = input.nextBoolean();
        System.out.println("Ücreti giriniz:");
        double ucret = input.nextDouble();
        System.out.println("Kira bedelini giriniz:");
        double kiraUcreti = input.nextDouble();
        System.out.println("Cephesini giriniz:");
        String cephesi = input.next();
        System.out.println("Binanın yaşını giriniz:");
        int yil = input.nextInt();

        Home sweetHome = new Home(yuzOlcumu, banyoSayisi, odaSayisi, garajiVar, ucret, kiraUcreti, cephesi, yil);

        sweetHome.print();

    }
}
