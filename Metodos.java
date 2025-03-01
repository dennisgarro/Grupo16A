import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese la cantidad de columnas de la matriz: ");
        int columnas = scanner.nextInt();
        scanner.nextLine();

        Boleto[][] boletos = new Boleto[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("\nIngrese los datos del boleto en la posición [" + i + "][" + j + "]:");
                System.out.print("Número de serie (fila): ");
                int numeroSerie = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Nombre del comprador: ");
                String nombre = scanner.nextLine();

                System.out.print("Precio: ");
                double precio = scanner.nextDouble();
                scanner.nextLine();

                boletos[i][j] = new Boleto(numeroSerie, nombre, precio);
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int pass = 0; pass < columnas - 1; pass++) {
                for (int j = 0; j < columnas - pass - 1; j++) {
                    if (boletos[i][j].numeroSerie < boletos[i][j + 1].numeroSerie) {
                        Boleto temp = boletos[i][j];
                        boletos[i][j] = boletos[i][j + 1];
                        boletos[i][j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("\nMatriz de boletos ordenada por número de serie (fila) de mayor a menor:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(boletos[i][j] + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
