/**
 * Author:
 * Date:
 * Description:
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce coordenada x:");
        float numeroX = scanner.nextFloat();
        System.out.println("Introduce coordenada y:");
        float numeroY = scanner.nextFloat();
        System.out.println("La distancia es: " + distancia(numeroX,numeroY));
    }

    // La función distancia devuelve la distancia al origen según la fórmula....
    private static double distancia(float numeroX, float numeroY){
        return Math.sqrt(Math.pow(numeroX,2) + Math.pow(numeroY,2));
    }
}
