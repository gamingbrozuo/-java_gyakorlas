package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);    // Scanner létrehozása ami bekér a felhasználotól egy adatot a konzolra.
        System.out.print("Adja meg az első számot(csak egész szám): ");  // Felhasználót megkéri hogy adja meg az első
                                            // számot ami csak egész lehet.
        int szam = konzol.nextInt();    // szam valtozóban eltárolja az egész(integer osztályban lévő) számot
        System.out.print("Adja meg a második számot(csak egész szám): ");    // A felhasználót megkéri a program hogy írjon be egy második
                                            // számot ami csak egész szám lehet
        int szam1 = konzol.nextInt();   //szam1 változóban eltárolja az egész számot(integer osztály) amit a felhasználó megadott
        if (szam > szam1){  // if elégazási ciklusban megvizsgálja hogy szam nagyobb-e mint a szam 1
            System.out.printf("A %d a nagyobbik szám", szam1);
        }   // Ha igaz az állítás hogy nagyobb akkor kiírja a szam1-et formázottan
        else if (szam < szam1) // Ha nem igaz az elöző feltétel és nem teljesül akkor átlép a kövtkező feltételre ahol
            // megvizsgálja hogy szam szam 1 nagyobb e mint szam.(ezt egy különben ha ág végzi)
        {
            System.out.printf("A %d a nagyobbik szám", szam1); // Ha igaz az állízás akkor formázottan kiírja a szam1 változót
        }
        else {      // Ha egyik ág sem teljesül akkor továbblépünk a különben ágra,
            System.out.printf("A %d és %d szám egyenlő", szam, szam1); // és itt formázottan kiírjuk hogy a két szám egyenlő
        }
    }
}