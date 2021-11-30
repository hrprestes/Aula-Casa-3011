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
public class Sofá {
    String cor;
    String peso;
    String TamanhoComp;
    int quantidade;
    
    
    
    void imprimeDadosSfoá() {
       System.out.println("---------SOFÁ---------");
       System.out.println("Cor do Sofá: "+ cor);
       System.out.println("peso do sofá: "+ peso);
       System.out.println("Tamanho emcomprimento do Sofá: "+ TamanhoComp);
       System.out.println("Quantidade de sofás: "+ quantidade);
       }
       
    
public String getCor() {
       return cor;
}
   public void setCor (String cor) {
       this.cor=cor;
   }
   
public String getPeso() {
       return peso;
}
   public void setPeso (String peso) {
       this.peso=peso;
   }
   
  public String getTamanhoComp() {
       return TamanhoComp;
}
   public void setTamanhoComp (String TamanhoComp) {
       this.TamanhoComp=TamanhoComp;
   } 
   
   public int getQuantidade() {
       return quantidade;
}
   public void setQuantidade (int quantidade) {
       this.quantidade=quantidade;
       
   }

   
}