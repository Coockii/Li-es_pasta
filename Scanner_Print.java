import java.util.*;
import java.lang.*;
import java.io.*;

// Os comandos possuem explicações na linha de baixo ;) ;
// ;) <-- piscadela;

class Main {
    public static void main(String [] args) {
        int num ; //Variável nomeVariável;
      
    Scanner ler = new Scanner (System.in);
    /** Cria um "Objeto" que recebe a função de ler uma entrada (input = entrada)  ; 
     O tal objeto chama-se "ler"   
    */
        num = ler.nextInt();  // 
/**     Aqui usamos "ler" como Scanner;
        ler.nextInt (); -- next = próximo ( indica que uma variavel será lida );
        Int ( escrito com 1 letra "M" - indica o tipo de dado );
        num = (é a variável a ser lida);
*/
        
        System.out.printf("Numero: %d\n",num);
        // Exibição como em linguagem " C "
        
        System.out.println("Numero = " + num);
        // Exibição Java.  Note que NÃO possui " , " separando os caracteres dos dados ;
    }
}