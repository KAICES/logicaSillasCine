/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicasillascine;

import javax.swing.*;
import java.util.Arrays;

/**
 *
 * @author TIC-SCI
 */
public class LogicaSillasCine {

    
    
    public static void main(String[] args) {
        
        int FIL = 5 ;
        int COL = 10 ;
        
        
        String matsilla [][];
        
        LogicaSillasCine ms = new LogicaSillasCine();
        
        matsilla = new String[FIL][COL];
        ms.lea(matsilla);
        ms.escriba(matsilla);
        
        
    }
    
    public void lea (String matsilla [][]){
        
        int i,j;
        String num;
        String letrasilla = JOptionPane.showInputDialog("Digite una letra");
        int colSilla = 0 ;
        int filSilla = (Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")))-1;
        
        
        switch ( letrasilla ) {
      case "A":
           colSilla = 0 ;
           break;
      case "B":
           colSilla = 1 ;
           break;
      case "C":
           colSilla = 2 ;
           break;
      case "D":
           colSilla = 3 ;
           break;
      case "E":
           colSilla = 4 ;
           break;
      case "F":
           colSilla = 5 ;
           break;
      case "G":
           colSilla = 6 ;
           break;
      case "H":
           colSilla = 7 ;
           break;
      case "I":
           colSilla = 8 ;
           break;
      case "J":
           colSilla = 9 ;
           break;
      default:
           System.out.println("error" );
           break;
      }
        
        
        
        for(i=0;i<matsilla.length;i++)
            for(j=0;j<matsilla[i].length;j++){
                if(colSilla == j && filSilla == i ){
                    matsilla[i][j]= "1";
                    
                }else{
                    matsilla[i][j]= "0";
                }
                
            
        }
    }
    
    public void escriba(String mat[ ][ ])
    {

        int i, j;
        String Salida = "Elementos de la Matriz\n";
        for(i=0;i<mat.length;i++) {
            for(j=0;j<mat[i].length;j++)
               Salida+=mat[i][j]+" ";
               Salida+="\n";
        }
    JOptionPane.showMessageDialog(null,Salida,"MATRIZ DE NUMEROS",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
