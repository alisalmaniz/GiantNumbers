/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giantnumbers;

import javax.swing.JOptionPane;

/**
 *
 * @author Ali salmani
 */
public class GiantNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       Menu menu = new Menu();
       
       int selection = menu.showMenu();
       
       menu.operation(selection);
        
        
    }
    
}
