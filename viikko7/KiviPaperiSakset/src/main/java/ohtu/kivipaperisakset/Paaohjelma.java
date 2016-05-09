package ohtu.kivipaperisakset;

import java.util.HashMap;
import pelit.KPSTekoaly;
import java.util.Map;
import pelit.KPSPelaajaVsPelaaja;
import pelit.KPSParempiTekoaly;
import pelit.Pelattavat;
import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);
    private static Map<String, Pelattavat> komennot = new HashMap<String, Pelattavat>();

    public static void main(String[] args) {
        komennot.put("a", new KPSPelaajaVsPelaaja(scanner));
        komennot.put("b", new KPSTekoaly(scanner));
        komennot.put("c", new KPSParempiTekoaly(scanner));

        while (true) {
            annaOhjeet();
            String vastaus = scanner.nextLine();

            if (vastaus.equals("a") || vastaus.equals("b") || vastaus.equals("c")) {
                Pelattavat komento = komennot.get(vastaus);
                System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
                komento.pelaa();
            } else {
                break;
            }

        }

    }

    private static void annaOhjeet() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");

    }
}
