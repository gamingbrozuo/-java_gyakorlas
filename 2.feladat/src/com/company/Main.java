package com.company;

import java.util.Scanner; // Java Scanner (konzol) beimportálása

public class Main {

    public static void main(String[] args) {
	    Scanner konzol = new Scanner(System.in); // Scanner létrehozása ami bekér a felhasználotól egy adatot a konzolra.
        System.out.println("Adja meg a nevét: "); // Kiíratjuk a felhasználóval a nevét, üt egy entert és ott fog megjelenni.
        String nev = konzol.nextLine(); // Eltároljuk a felhasználó nevét egy String változóban és a következő sor kerül beolvasásra
        System.out.printf("Szia %s", nev); // Kííratjuk azt hogy szia és utána a felhasználó nevét (formázott kiíratásban)
     }
}
