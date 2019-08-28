package com.rizkykhapidsyah.javafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        //Deklarasi Array
        String[] heroes = new String[2];

        heroes[0] = "riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

        //Menggunakan ArrayList
        List<String> planets = new ArrayList<>();

        planets.add("Mercury"); //Method add untuk menambahkan objek ke list
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars"); //objek lainnya masih bsia terus ditambahkan ke list

        System.out.println("List Planet Awal :");
        for (int i = 0; i < planets.size(); i++) {
            // method size() untuk mendapatkan ukuran List
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

        planets.remove("Venus"); //method remove() untuk mengeluarkan objek dari List

        System.out.println("List Planet Akhir :");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

    }
}
