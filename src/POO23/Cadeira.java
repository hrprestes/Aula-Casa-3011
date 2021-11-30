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
public class Cadeira {
    String cor;
    String peso;
    String Material;
    int quantidade;
   
    
    void imprimeDadosCadeira() {
       System.out.println("---------CADEIRA---------");
       System.out.println("Cor da cadeira: "+ cor);
       System.out.println("peso da cadeira: "+ peso);
       System.out.println("Material usado na cadeira: "+ Material);
       System.out.println("Quantidade de cadeiras: "+ quantidade);
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
   
  public String getMaterial() {
       return Material;
}
   public void setMaterial (String Material) {
       this.Material=Material;
   } 
   
   public int getQuantidade() {
       return quantidade;
}
   public void setQuantidade (int quantidade) {
       this.quantidade=quantidade;
   }
   
}
