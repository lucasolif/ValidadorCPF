
package validadorcpf;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        System.out.print("Informe o CPF: ");
        CPF cpf = new CPF(scn.nextLine());
    
        Validador validador = new Validador(cpf.getCpf());
        validador.ConversorStringInteiro();
        
        if(validador.Validador()){
            System.out.printf("CPF: %s é válido.\n", cpf.getCpf());
        }
        else{
            System.out.printf("CPF: %s é inválido.\n", cpf.getCpf());
        }       
    }
    
}
