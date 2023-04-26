package org.example.ejemplo2;

public class Motocicleta implements Vehiculo{
    private int centimetrosCubicos;
    private String marca;

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centimetrosCubicos=" + centimetrosCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }

    public int getCentimetrosCubicos() {
        return centimetrosCubicos;
    }

    public void setCentimetrosCubicos(int centimetrosCubicos) {
        this.centimetrosCubicos = centimetrosCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motocicleta(int centimetrosCubicos, String marca) {
        this.centimetrosCubicos = centimetrosCubicos;
        this.marca = marca;
    }

    public Motocicleta() {
    }
    public void hacerCaballito(){
        System.out.println("Haciendo caballito para romperme un hueso");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta marca "+ this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta marca "+ this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando la motocicleta de "+ this.centimetrosCubicos+" CC");

    }

    @Override
    public void frenar() {
        System.out.println("Avanzando la motocicleta de "+ this.centimetrosCubicos+" CC");

    }
}
