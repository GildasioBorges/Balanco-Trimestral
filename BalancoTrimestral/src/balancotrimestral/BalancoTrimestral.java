/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancotrimestral;

/**
 *
 * @author 05.10871-3
 */
public class BalancoTrimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int gastosJaneiro;
      gastosJaneiro=15000;
      int gastosFevereiro;
      gastosFevereiro=23000;
      
      int gastosMarco;
      gastosMarco=17000;
      int gastosTrimestre = gastosJaneiro+gastosFevereiro+gastosMarco;
      
      System.out.println(gastosTrimestre);
     
      double mediaMensal;
      mediaMensal = gastosTrimestre / 3.0;
      System.out.println(mediaMensal);
      
    }
    
}
