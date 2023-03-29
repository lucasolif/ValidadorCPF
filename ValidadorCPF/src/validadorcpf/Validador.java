/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validadorcpf;

import java.util.ArrayList;


public class Validador {

    private String cpf;
    int contAux = 8;
    int posicao = 2;
    int somaNumCpf = 0;
    ArrayList<Integer> listaCpf = new ArrayList<>();
    String[] arrayCpf = new String[11];   

    public Validador(String cpf) {
        this.cpf = cpf;
    }
    
    public void ConversorStringInteiro(){
        this.arrayCpf = this.cpf.split("(?!^)");
        
        for (String arrayCpf1 : this.arrayCpf) {
            this.listaCpf.add(Integer.parseInt(arrayCpf1));
        }
   
    }
    
    public boolean Validador(){
        
        boolean retorno = true;
        
        for(int x = 0; x < 2; x++){
            
            for(int i = this.contAux; i >= 0; i--){
                this.somaNumCpf += this.listaCpf.get(i) * this.posicao;
                this.posicao++;
            }
            
            if((this.somaNumCpf%11 < 2) && (this.listaCpf.get(this.contAux+1) != 0)){
                retorno = false;
  
            }
            else if((somaNumCpf%11 >= 2) && (listaCpf.get(contAux+1) != 11 - somaNumCpf % 11)){
                return false;
            }
            
            contAux += 1;
            somaNumCpf = 0;
            posicao = 2;
        }
        
        return retorno;
    }
    
    
}
