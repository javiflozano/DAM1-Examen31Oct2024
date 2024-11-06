import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Declaraciones
        ArrayList<String> nombresMasculino = new ArrayList<>(Arrays.asList( "Alejandro", "Carlos", "David", "Juan", "Miguel", "José", "Francisco", "Luis", "Javier", "Raúl", "Sergio", "Andrés", "Manuel", "Adrián", "Pedro", "Enrique", "Ángel", "Iván", "Pablo", "Rubén", "Fernando", "Gabriel", "Hugo", "Cristian", "Óscar", "Joaquín", "Eduardo", "Víctor", "Mario", "Jaime", "Jorge", "Antonio", "Tomás", "Diego", "Martín", "Alberto", "Ricardo", "Ismael", "Marcelo", "Emilio", "Ramón", "Marcos", "Ezequiel", "Sebastián", "Guillermo", "Rodrigo", "Daniel", "Simón", "Alfonso", "Gonzalo", "Julián", "César", "Rafael", "Eugenio", "Héctor", "Raúl", "Agustín", "Arnau", "Samuel", "Lucas", "Álvaro", "Elías", "Bruno", "Nicolás", "Bautista", "Fabio", "Axel", "Rafael", "Jonás", "Ignacio", "Facundo", "Maximiliano", "Baltasar", "Mateo", "Saúl", "Milton", "Raimundo", "Gerardo", "Kevin", "Gael", "Fabián", "Aarón", "Mauricio", "Rodolfo", "Benjamín", "Esteban", "Alexis", "Adolfo", "Martín", "Patricio", "Eduard", "Lionel", "Lorenzo", "Camilo", "Damián", "Alan", "Felipe", "Max", "Cristóbal" ));
        ArrayList<String> nombresFemeninos = new ArrayList<>(Arrays.asList( "María", "Ana", "Carmen", "Laura", "Isabel", "Marta", "Elena", "Lucía", "Sara", "Paula", "Patricia", "Cristina", "Pilar", "Beatriz", "Rosa", "Sofía", "Claudia", "Carla", "Teresa", "Raquel", "Nuria", "Silvia", "Andrea", "Sandra", "Alba", "Julia", "Inés", "Victoria", "Irene", "Eva", "Rocío", "Susana", "Angela", "Alicia", "Daniela", "Lorena", "Verónica", "Celia", "Natalia", "Noelia", "Mónica", "Lidia", "Esther", "Olga", "Amparo", "Aurora", "Mercedes", "Blanca", "Luciana", "Ariadna", "Gabriela", "Milagros", "Antonia", "Emilia", "Adriana", "Rebeca", "Ainhoa", "Bárbara", "Lourdes", "Noemí", "Sonia", "Belén", "Vanesa", "Mireia", "Elisa", "Gema", "Alejandra", "Lara", "Yolanda", "Nerea", "Carlota", "Jimena", "Amalia", "Estefanía", "Consuelo", "Manuela", "Fabiola", "Ruth", "Araceli", "Aitana", "Elsa", "Margarita", "Ester", "Anaís", "Valeria", "Alicia", "Josefina", "Elvira", "Carolina", "Leyre", "Ángela", "Eva María", "Maite", "Paloma", "Fátima", "Triana", "Romina", "Diana", "Isis", "Cecilia" ));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce nombre");
        String nombre = scanner.nextLine();
        if (nombresMasculino.contains(nombre)){
            System.out.println("Hola Sr. " + nombre);
        } else if (nombresFemeninos.contains(nombre)){
            System.out.println("Hola Sra. " + nombre);
        } else {
            System.out.println("Hola Sr/Sra " + nombre);
        }

    }
}
