import java.util.*;
import java.lang.*;
import java.io.*;



class Main {
    public static void main(String [] args) {
    int num ;
    String opa;
        Scanner ler = new Scanner (System.in);
        System.out.printf("numero: ");
        num = ler.nextInt();
        
        ler.nextLine(); // Limpa Buffer. Só usar no vento, assim mesmo, sem nada , N A D A
        
        
        System.out.printf("Digite uma palavra: ");
        
        opa= ler.next();
        
        System.out.println(num);
        System.out.println(opa);
        
        
        
        
        
    }
}

