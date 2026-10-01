/** 

 * Tarea 1: verifica un bucle anidado mediante variables de seguimiento. 

 */ 

public class BucleAnidado { 

  

    public static void main(String[] args) { 

        int filas = 3; 

        int columnas = 4; 

  

        // Variables de seguimiento globales. 

        int numeroIteraciones = 0; 

        int sumaTotal = 0; 

  

        System.out.println("TABLA DE SEGUIMIENTO DEL BUCLE ANIDADO"); 

        System.out.println("---------------------------------------------------------------"); 

        System.out.printf("%-5s %-8s %-8s %-10s %-11s %-10s%n", 

                "Fila", "Columna", "Valor", "Suma fila", "Suma total", "Iteración"); 

  

        for (int fila = 1; fila <= filas; fila++) { 

            // Se reinicia al comenzar cada fila. 

            int sumaFila = 0; 

  

            for (int columna = 1; columna <= columnas; columna++) { 

                int valor = fila * columna; 

  

                // Actualización de las variables de seguimiento. 

                sumaFila += valor; 

                sumaTotal += valor; 

                numeroIteraciones++; 

  

                System.out.printf("%-5d %-8d %-8d %-10d %-11d %-10d%n", 

                        fila, columna, valor, sumaFila, sumaTotal, numeroIteraciones); 

            } 

  

            System.out.println("Fin de la fila " + fila + ": sumaFila = " + sumaFila); 

        } 

  

        int iteracionesEsperadas = filas * columnas; 

  

        System.out.println("---------------------------------------------------------------"); 

        System.out.println("Iteraciones esperadas : " + iteracionesEsperadas); 

        System.out.println("Iteraciones realizadas: " + numeroIteraciones); 

        System.out.println("Suma total            : " + sumaTotal); 

        System.out.println("¿Resultado correcto?  : " 

                + (numeroIteraciones == iteracionesEsperadas && sumaTotal == 60)); 

    } 

} 

  