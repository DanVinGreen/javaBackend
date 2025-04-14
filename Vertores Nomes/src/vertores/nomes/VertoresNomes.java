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
        String[] responsavel = new String [5];
        String[] Situacao = new String[5];
        
        // Loop para coletar 5 nomes
        for (int i = 0; i < 5; i++) {  
         System.out.print("Informe O Nome : " + (i + 1) + " ");
            nomes[i] = sc.nextLine();

            // Coleta o responsável
            System.out.print("Informe o responsavel para " + nomes[i] + ": ");
            responsavel[i] = sc.nextLine();
            
             // Coleta a nota média para cada nome
            System.out.print("Informe a nota media para " + nomes[i] + ": ");
            notas[i] = sc.nextDouble();
            sc.nextLine(); // Limpa o buffer do scanner
            
            //se media >= 7 "Aprovado" senão "Reprovado"
            if (notas[i] >= 7){
            Situacao[i] = "Aprovado";
            } else {
            Situacao[i] = "Reprovado";
    
            }
    }
  // Exibe os nomes, notas e situações
   /*    System.out.println("\nNomes, Notas e Situcao:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print(nomes[i] + " _ " + notas[i] + " _ " + Situacao[i]);
            if (i < nomes.length - 1) {
                System.out.print(" | "); // Adiciona o separador entre os nomes, notas e situações 
            }
        } */
        
   for(int pos =0; pos < 5; pos++){
    System.out.println("Aluno: " + nomes[pos]);
            System.out.println("Media: " + notas[pos]);
            System.out.println("Situacao: " + Situacao[pos]);
            System.out.println("Responsavel: " + responsavel[pos]);
            System.out.println(); // Adiciona uma linha em branco para melhor legibilidade
        }
        
  
       
       
    }
}
