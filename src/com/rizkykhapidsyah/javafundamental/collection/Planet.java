package com.rizkykhapidsyah.javafundamental.collection;

class Planet {
    private String Name;
    private double Mass;

    public Planet(String Name, double Mass) {
        this.Name = Name;
        this.Mass = Mass;
    }

    @Override
    public String toString() {
        return "Planet " + Name + ", Mass" + Mass;
    }
}
