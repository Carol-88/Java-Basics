import claseAbstracta.*;
import instancia.Coche;
import instancia.CuentaBancaria;
import instancia.Persona;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //VERDE
        System.out.println("\n****Primer ejercicio****\n");
        Coche coche1 = new Coche("Hyundai", "Coupe");
        Coche coche2 = new Coche("Ford", "Fiesta");
        System.out.println("Coche 1 " + coche1);
        System.out.println("Coche 2 " + coche2);

        //AMARILLO
        System.out.println("\n****Segundo ejercicio****\n");

        Persona persona1 = new Persona("Ana", 30);
        Persona persona2 = new Persona("Carlos", 25);
        Persona persona3 = new Persona("Elena", 40);

        System.out.println("Persona 1: " + persona1);
        System.out.println("Persona 2: " + persona2);
        System.out.println("Persona 3: " + persona3);

        System.out.println("\n Cambio edad a Persona2\n");
        persona2.setEdad(14);

        System.out.println("Persona 1: " + persona1);
        System.out.println("Persona 2: " + persona2);
        System.out.println("Persona 3: " + persona3);

        //ROJO
        System.out.println("\n****Tercer ejercicio****\n");

        CuentaBancaria miCuenta = new CuentaBancaria(1000);
        System.out.println("Saldo inicial: " + miCuenta);

        System.out.println("\n--- Realizando Operaciones ---");

        // Depositar
        miCuenta.depositar(500);


        // Retirar con saldo suficiente
        miCuenta.retirar(200);


        // Retirar con saldo insuficiente
        miCuenta.retirar(2000);


        // Intentar depositar o retirar montos inválidos
        miCuenta.depositar(-100);
        miCuenta.retirar(0);

        System.out.println("\n--- Saldo Final ---");
        System.out.println("Saldo final de la cuenta: " + miCuenta.getSaldo());

        System.out.println("\n****## Clases abstractas ##****\n");
        System.out.println("\n****Primer ejercicio****\n");

        Animal perro = new Perro();
        perro.hacerSonido();

        System.out.println("\n****Segundo ejercicio****\n");

        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());

        // la línea se lee como: "Para cada animal en la lista de animales, haz lo siguiente...".
        for (Animal animal : animales) {
            animal.hacerSonido();
        }

        System.out.println("\n****Segundo ejercicio****\n");
        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Circulo(5.0));
        figuras.add(new Rectangulo(4.0, 6.0));

        for (FiguraGeometrica figura : figuras) {
            figura.calcularArea();
        }

    }
}
