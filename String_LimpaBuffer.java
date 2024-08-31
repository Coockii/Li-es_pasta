import java.util.*;
import java.lang.*;
import java.io.*;

// Os comandos possuem explicações na linha de baixo ;) ;
// ;) <-- piscadela;

class Main {
    public static void main(String [] args) {
      string palavra;
        // palavra;
      string frase ;
        // será uma frase com espaços ex. -- O Diogo é chato pra cacete;

          
       Scanner ler = new Scanner (System.in);
        // instanciando e criando um novo objeto Scanner. Este irá lidar com String;
        Scanner leia = new Scanner (System.in);
        // Novo Scanner. Este irá lidar com String nextLine (Guarda os espaços vazios);
        
/** 
Podemos criar 2 scanner's ou limpar o buffer do teclado
    basta usar: 
            ler.next();
        antes de usa-lo em uma variável
        Scanner ler = new Scanner(System.in)
    // 2. instanciando e criando um objeto Scanner
    int idade;
    String nome;

    System.out.printf("Informe a sua idade:\n");
    idade = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)

    ler.nextLine(); // esvazia o buffer do teclado

    System.out.printf("\nInforme o seu nome:\n");
    nome = ler.nextLine(); // 3. entrada de dados (lendo uma String)

    System.out.printf("\nResultado:\n");
    System.out.printf("%s tem %d anos.\n", nome, idade);

*/
            
   
       System.out.printf("Informe uma palavra:\n");
       
        palavra = ler.next();
        // Comando para ler String;
       
       System.out.printf(palavra);
        // Exibir variável palavra;
        
        System.out.printf("Informe uma palavra:\n");
      
        frase = ler.nextLine();
        // Comando para ler String. nextLine ( Guarda os espaços vazios );
       
       System.out.printf(frase);
        // Exibir variável frase;
       
    
    }
}