package com.rizkykhapidsyah.javafundamental.collection;

import java.util.*;

public class SetPlanet {
    public static void main(String[] args) {
        //Menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("Merkurius"); // method add() untuk menambahkan objek ke Set
        planets.add("Venus");
        planets.add("Bumi");
        planets.add("Bumi"); // menambahkan objek "bumi" beberapa kali
        planets.add("Bumi");
        planets.add("Mars"); // objek bisa terus ditambahkan ke Set

        //method size() untuk mendapatkan ukuran Set
        System.out.println("Set Planet Awal: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("Venus");  // method remove() untuk mengeluarkan objek dari Set

        System.out.println("Set Planet Akhir: (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // looping menggunakan Iterator
            System.out.println("\t " + iterator.next());
        }


    }
}
