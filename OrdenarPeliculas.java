package tallerU3_2caso;
import java.util.*;

public class OrdenarPeliculas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de películas
        System.out.print("¿Cuántas películas deseas ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Crear una lista para almacenar los datos de las películas
        String[] titulos = new String[cantidad];
        int[] anios = new int[cantidad];
        String[] generos = new String[cantidad];

        // Solicitar los datos de cada película
        ingresarDatosPeliculas(scanner, cantidad, titulos, anios, generos);

        // Ordenar las películas por año
        ordenarPorAnio(titulos, anios, generos);

        // Mostrar la lista ordenada de películas
        mostrarPeliculas(titulos, anios, generos);

        scanner.close();
    }

    // Método para solicitar los datos de cada película
    public static void ingresarDatosPeliculas(Scanner scanner, int cantidad, String[] titulos, int[] anios, String[] generos) {
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nIngrese los datos de la película #" + (i + 1));

            System.out.print("Título: ");
            titulos[i] = scanner.nextLine();

            System.out.print("Año de lanzamiento: ");
            anios[i] = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.print("Género: ");
            generos[i] = scanner.nextLine();
        }
    }

    // Método para ordenar las películas por año
    public static void ordenarPorAnio(String[] titulos, int[] anios, String[] generos) {
        for (int i = 0; i < anios.length - 1; i++) {
            for (int j = i + 1; j < anios.length; j++) {
                if (anios[i] > anios[j]) {
                    // Intercambiar los años
                    int tempAnio = anios[i];
                    anios[i] = anios[j];
                    anios[j] = tempAnio;

                    // Intercambiar los títulos
                    String tempTitulo = titulos[i];
                    titulos[i] = titulos[j];
                    titulos[j] = tempTitulo;

                    // Intercambiar los géneros
                    String tempGenero = generos[i];
                    generos[i] = generos[j];
                    generos[j] = tempGenero;
                }
            }
        }
    }

    // Método para mostrar la lista ordenada de películas
    public static void mostrarPeliculas(String[] titulos, int[] anios, String[] generos) {
        System.out.println("\nLista de películas ordenada por año de lanzamiento:");
        for (int i = 0; i < titulos.length; i++) {
            System.out.println("Título: " + titulos[i] + ", Año: " + anios[i] + ", Género: " + generos[i]);
        }
    }
}