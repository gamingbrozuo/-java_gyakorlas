package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in); // Scanner létrehozása ami bekér a felhasználotól egy adatot a konzolra.
        System.out.print("Kérek egy számot: "); // Szám bekérése a felhasználotól
        double szam = konzol.nextDouble(); // Eltároljuk a felhasználó által megadott számot egy szam(double)
                                           // változóban és a következő sor kerül beolvasásra
        double ketszeres = szam * 2; // ketszeres változóban kerül eltárolásra a felhasználó által
                                     // megadott szám kétszeres alakja.
        System.out.printf("A bekért szám kétszeres alakja(két tizedesjegy pontosággal): %.2f", ketszeres); // Kiíratjjuk
                                    // a szám kétszeres alakját formázott alakban.
    }
}
