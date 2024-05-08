package com.entelgy.challenge;

import java.util.ArrayList;
import java.util.List;

import com.entelgy.challenge.Pojos.Animal;
import com.entelgy.challenge.Pojos.Gato;
import com.entelgy.challenge.Pojos.Perro;
import com.entelgy.challenge.Pojos.Vaca;

public class Reporte {
  
    public List<Animal>  cargarDatos() {
        List<Animal> animales = new ArrayList<>();

        List<Perro> lstPerro = new ArrayList<>();
        Perro perro = new Perro();
        perro.setNombre("Fido");
        perro.setEdad(5);
        perro.setRaza("Labrador");
        perro.setTiempoDeVida(12);

        Perro perro2 = new Perro();
        perro2.setNombre("Rex");
        perro2.setEdad(3);
        perro2.setRaza("Bulldog");
        perro2.setTiempoDeVida(10);

        Perro perro3 = new Perro();
        perro3.setNombre("Bobby");
        perro3.setEdad(3);
        perro3.setRaza("Golden Retriever");
        perro3.setTiempoDeVida(14);

        Gato gato1 = new Gato();
        gato1.setNombre("Bobby");
        gato1.setEdad(3);
        gato1.setRaza("Golden Retriever");
        gato1.setTiempoDeVida(14);

        Gato gato2 = new Gato();
        gato2.setNombre("Bobby");
        gato2.setEdad(3);
        gato2.setRaza("Golden Retriever");
        gato2.setTiempoDeVida(14);

        Gato gato3 = new Gato();
        gato3.setNombre("Bobby");
        gato3.setEdad(3);
        gato3.setRaza("Golden Retriever");
        gato3.setTiempoDeVida(14);

        Vaca vaca1 = new Vaca();
        vaca1.setNombre("Bobby");
        vaca1.setEdad(3);
        vaca1.setRaza("Golden Retriever");
        vaca1.setTiempoDeVida(14);

        Vaca vaca2 = new Vaca();
        vaca2.setNombre("Bobby");
        vaca2.setEdad(3);
        vaca2.setRaza("Golden Retriever");
        vaca2.setTiempoDeVida(14);

        Vaca vaca3 = new Vaca();
        vaca3.setNombre("Bobby");
        vaca3.setEdad(3);
        vaca3.setRaza("Golden Retriever");
        vaca3.setTiempoDeVida(14);

        animales.add(perro);
        animales.add(perro2);
        animales.add(perro3);
        animales.add(gato1);
        animales.add(gato2);
        animales.add(gato3);
        animales.add(vaca1);
        animales.add(vaca2);
        animales.add(vaca3);

        return animales;
    }

    public void principal(Animal[] animales, String nombre) {
        boolean encontrado = false;
        for (Animal animal : animales) {
            if (animal.getNombre().equals(nombre)) {
                animal.describir();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new RuntimeException("Animal no encontrado");
        }
    }

    /* public static void main(String[] args) {
        Reporte reporte = new Reporte();
        List<Animal>  animales = reporte.cargarDatos();
        try {
            reporte.principal(animales, "Fido");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    } */
}
