/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO23;

/**
 *
 * @author SAMSUNG
 */
public class Principal2 {
    
    public static void main(String[] args) {
   
    Cadeira cadeira = new Cadeira();
    cadeira.setCor("marrom");
    cadeira.setMaterial("Madeira");
    cadeira.setPeso("1kg");
    cadeira.setQuantidade(4);
    
    cadeira.imprimeDadosCadeira();
    
   
    Sofá sofá = new Sofá();
    sofá.setCor("branco");
    sofá.setTamanhoComp("2m");
    cadeira.setPeso("6,5Kg");
    cadeira.setQuantidade(2);
    
    sofá.imprimeDadosSfoá();
    
}

}