package com.entelgy.challenge.Pojos;

public class Animal {
    protected String nombre;
    protected int edad;
    protected String raza;
    protected int tiempoDeVida;
    protected String tipo;

    public Animal(String nombre, int edad, String raza, int tiempoDeVida, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tiempoDeVida = tiempoDeVida;
        this.tipo = tipo;
    }

    

    public Animal() {
    }


    public void describir() {
        System.out.println(nombre + " es un " + tipo + " de raza " + raza + " que tiene " + edad + " de edad. Siempre " + tipo + " cuando está feliz. Su expectativa de vida es de " + tiempoDeVida + " años.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
}



