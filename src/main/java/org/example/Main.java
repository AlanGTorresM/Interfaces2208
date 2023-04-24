package org.example;

import org.example.herenciamultiple.Alumno;
import org.example.herenciamultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("El area es igual a "+cuadrado.calcularArea());
        Circulo circulo= new Circulo();
        circulo.setRadio(2.4);
        System.out.println("El area es igual a "+ circulo.calcularArea());
        AlumnoDeportistaArtista ada= new AlumnoDeportistaArtista();
        ada.setNombre("Juan");
        ada.setArte("Pintura");
        ada.setDeporte("Basket");
        System.out.println(ada);
        ada.ensayar("Oleo");
        ada.entrenar();
        ada.presentarCompetencia("Naucally");

    }
}