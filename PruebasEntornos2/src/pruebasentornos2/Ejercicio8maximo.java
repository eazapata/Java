/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasentornos2;

public class Ejercicio8maximo {
// la función es_primo indica si el número pasado es o no primo
// recordamos que un número primo es solo divisible por el mismo y 1

   
// esta función me devuelve la suma de los divisores propios.
// Es decir cualquier número que divida a num en el rango 1..num-1
//
// un ejemplo:
// los divisores propios de 24 son: 1, 2, 3, 4, 6, 8, 12

    static int suma_divisores_propios(int num) {
        int suma;
        suma = 0;
        for (int i = 1; i < num; i++) // al ser hasta i<num no tenemos en cuenta el propio num
        {
            if (num % i == 0) // si i divide a num
            {
                suma += i; // acumulamos i
            }
        }
        return (suma);
    }

    public static void main(String[] args) {
        int a, b;
        System.out.print("Introduce a: ");
        a = Entrada.entero();
        System.out.print("Introduce b: ");
        b = Entrada.entero();
        if (a == suma_divisores_propios(b) && b == suma_divisores_propios(a)) {
            System.out.println(a + " y " + b + " son amigos.");
        } else {
            System.out.println(a + " y " + b + " no son amigos...\nLa siguiente vez prueba con 220, 284.");
        }

    }
}
