package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);  // Scanner létrehozása ami bekér a felhasználotól egy adatot a konzolra.

        System.out.print("Adja meg az első számot: ");  // Be kérjük a felhasználótól az első számot
        double szam = konzol.nextDouble();  // Eltároljuk a szam(double) Változót és át térünk a következö értékre
        System.out.print("Adja meg a második számot: ");  // Be kérjük a felhasználótól a második számot
        double szam1 = konzol.nextDouble();  // Eltároljuk a szam1(double) Változót és át térünk a következö értékre, ami
                                             // a végeredmény kiíratása.

        double ossz = szam + szam1;  // Az ossz(double) változóban a szam et összeadja a szam1 el
        double kulonbseg = szam - szam1;  // a kulonbseg(double) változóban szam ot kivonja a szam1 ből
        double szorzat = szam * szam1;  // a szorzat(double) változóban szam ot megszorozzuk a szam1 el
        double hanyados = szam / szam1;  // a hanyados(double) változóban szam ot elosztjuk szam1 el

        System.out.println("A megadott számok eredményei (két tizedesjegyre kerekítve):");// kiíratjuk a következő szöveget és entert üt a konzol utána
        System.out.printf("Összege: %.2f \t Különbsége: %.2f \t Szorzata: %.2f \t Hányadosa: %.2f:   ",
                ossz, kulonbseg, szorzat, hanyados); // formázottan kiírjuk az eredményeket,
                                                    // két tizedesjegy pontossággal, és egy tabulátor elválasztással.
    }
}