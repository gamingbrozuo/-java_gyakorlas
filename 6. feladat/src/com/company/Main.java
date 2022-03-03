package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner konzol = new Scanner(System.in);    // Scanner létrehozása ami bekér a felhasználotól egy adatot a konzolra.
        System.out.println("Kérem adja meg az első egész számot: ");    // Felhasználót megkéri hogy adja meg az első
        // számot ami csak egész lehet.
	    int szam = konzol.nextInt();    // Eltárolja a szam változóban az egész számot
        System.out.println("Kérem adja meg a második egész számot: ");  // Felhasználót megkéri hogy adja meg a második
        // számot ami csak egész lehet.
        int szam1 = konzol.nextInt();   // Eltárolja a szam1 változóban az egész számot.
        System.out.println("Kérem adja meg a harmadik egész számot: "); // Felhasználót megkéri hogy adja meg a harmadik
        // számot ami csak egész lehet.
        int szam2 = konzol.nextInt();   // Eltárolja a szam2 változóban az egész számot.
        if ((szam < szam1) && (szam < szam2))   // ha elégazási ciklusban megvizsgálja hogy ha szam kisebb mint szam1
            // és szam kisebb mint szam2 és mind két állítás igaz rá akkor
        {
            System.out.printf("A %d a kisebb szám", szam);  // formázottan kiírja a szam karaktert a %d helyére
        }
        else if ((szam1 < szam) && (szam1 < szam2))     // különben ha elégazási ciklusban megvizsgálja hogy ha szam1 kisebb mint szam
        // és szam1 kisebb mint szam2, és mind két állítás igaz rá akkor
        {
            System.out.printf("A %d a kisebb szám", szam1); // formázottan kiírja a szam karaktert a %d helyére
        }
        else if ((szam2 < szam1) && (szam2 < szam)){     // különben elégazási ciklusban megvizsgálja hogy ha szam2 kisebb mint szam1
        // és szam2 kisebb mint szam, és mind két állítás igaz rá akkor
            System.out.printf("A %d a kisebb szám", szam2); // formázottan kiírja a szam karaktert a %d helyére
        }
    }
}
