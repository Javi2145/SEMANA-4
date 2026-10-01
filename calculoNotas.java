import java.util.Scanner; 

/** 

 * Tarea 2: clasifica una nota y permite cubrir todos los caminos de decisión. 

 */ 

public class CalculoNotas { 

  

    public static final String NOTA_INVALIDA = "Nota inválida"; 

    public static final String EXCELENTE = "Excelente"; 

    public static final String APROBADO = "Aprobado"; 

    public static final String SUPLETORIO = "Supletorio"; 

    public static final String REPROBADO = "Reprobado"; 

  

    public static String clasificarNota(double nota) { 

        // Camino 1: dato fuera del dominio permitido. 

        if (!Double.isFinite(nota) || nota < 0 || nota > 10) { 

            return NOTA_INVALIDA; 

        } 

  

        // Camino 2. 

        if (nota >= 9) { 

            return EXCELENTE; 

        } 

  

        // Camino 3. 

        if (nota >= 7) { 

            return APROBADO; 

        } 

  

        // Camino 4. 

        if (nota >= 5) { 

            return SUPLETORIO; 

        } 

  

        // Camino 5. 

        return REPROBADO; 

    } 

  

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

  

        System.out.print("Ingrese una nota entre 0 y 10: "); 

        String entrada = scanner.nextLine().trim().replace(',', '.'); 

  

        try { 

            double nota = Double.parseDouble(entrada); 

            System.out.println("Resultado: " + clasificarNota(nota)); 

        } catch (NumberFormatException excepcion) { 

            System.out.println("Error: debe ingresar un número válido."); 

        } 

  

        scanner.close(); 

    } 

} 