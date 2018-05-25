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
        
        
        int matsilla [][];
        
        LogicaSillasCine ms = new LogicaSillasCine();
        
        matsilla = new int[FIL][COL];
        ms.lea(matsilla);
        ms.escriba(matsilla);
        
        
    }
    
    public void lea (int matsilla [][]){
        
        int i,j;
        String num;
        for(i=0;i<matsilla.length;i++)
            for(j=0;j<matsilla[i].length;j++){
                num=JOptionPane.showInputDialog("digite un uno");
                matsilla[i][j]=Integer.parseInt(num);
            
        }
    }
    
    public void escriba(int mat[ ][ ])
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
