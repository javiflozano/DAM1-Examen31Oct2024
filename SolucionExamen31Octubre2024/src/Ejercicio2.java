import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author:
 * Date:
 * Description
 **/
public class Ejercicio2 {
    public static void main(String[] args) {
        // Declaraciones
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> divisores = new ArrayList<>();

        System.out.println("Introduce número");
        int numero = scanner.nextInt();
        for (int contador = 1;contador <= numero;contador++){
            if (numero%contador == 0){
                divisores.add(contador);
            }
        }
        System.out.println("Los divisores son: ");
        System.out.println(divisores);

    }
}
