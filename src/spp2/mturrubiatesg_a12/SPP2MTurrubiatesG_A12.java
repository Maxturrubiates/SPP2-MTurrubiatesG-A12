/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mturrubiatesg_a12;
import javax.swing.JOptionPane;
/**
 *
 * @author Max
 */
public class SPP2MTurrubiatesG_A12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double a, p, imc;
        String IMC;
        boolean flag;
        
        p=pedirDato("peso");
        a=pedirDato("altura");
        
        imc= p/Math.pow(a,2);
          if(imc>25){
              JOptionPane.showMessageDialog(null, "Usted tiene sobrepeso. IMC =" +imc);
          }else if(imc<19){
              JOptionPane.showMessageDialog(null, "Usted tiene desnutrición. IMC =" +imc);
          }else{
              JOptionPane.showMessageDialog(null,"Usted tiene un IMC normal. IMC =" +imc);
          }
    }
    
    public static double pedirDato(String mensaje){
        boolean flag;
        double dato=0;
            do{
                String datoP = JOptionPane.showInputDialog(null, "Introdusca su " +mensaje);
                try{
                    dato = Double.parseDouble(datoP);
                    flag=false;
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Error, el dato no es un numero");
                    flag=true;
                }
            }while(flag);
            return dato;
    }
    
}