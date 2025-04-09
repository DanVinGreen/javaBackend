package vertores.nomes;
import java.util.Scanner;
public class VertoresNomes {

    private static int i;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     // Cria um array para armazenar 5 nomes
        String[] nomes = new String[5];
        // Cria um array para armazenar as notas médias
        double[] notas = new double[5];
 
        // Loop para coletar 5 nomes
        for (int i = 0; i < 5; i++) {  
         System.out.print("Informe O Nome : " + (i + 1) + " ");
            nomes[i] = sc.nextLine();

             // Coleta a nota média para cada nome
            System.out.print("Informe a nota media para " + nomes[i] + ": ");
            notas[i] = sc.nextDouble();
            sc.nextLine(); // Limpa o buffer do scanner
            
    }
  // Exibe os nomes e suas respectivas notas
        System.out.println("\nNomes e Notas:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print(nomes[i] + " _ " + notas[i]);
            if (i < nomes.length - 1) {
                System.out.print(" | "); // Adiciona o separador entre os nomes e notas
            }
        }
        
        // Fecha o scanner
        sc.close();
    }
}