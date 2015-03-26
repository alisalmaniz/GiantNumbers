/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giantnumbers;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ali salmani
 */
public class Menu {
    
    
    public int showMenu(){
        
        String s = JOptionPane.showInputDialog(  "Enter the number of Operation you want:\n"
                                                    + "1.Sum\n"
                                                    + "2.Subtract\n"
                                                    + "3.Multiplication\n"
                                                    + "4.Compare\n"
                                                    + "5.Is zero\n"
                                                    + "6.Exite");
        
        int selection = Integer.parseInt(s);
        
/*        System.out.println("Enter the number of Operation you want");
        System.out.println("1.Sum");
        System.out.println("2.Subtract");
        System.out.println("3.Multiplication");
        System.out.println("4.Compare");
        System.out.println("5.Is zero");
        System.out.println("6.Exite");
        
        Scanner in =new Scanner(System.in);
        int selection= in.nextInt();
 */       
        return selection;
    }
    
    public void operation(int selection){
        
        if(selection == 1){
            
            Store store = new Store();
            Sum sum=new Sum(store.set1(), store.set2());
            sum.sumAndPrint();
        }
        else if(selection == 2){
            
            String s2 = JOptionPane.showInputDialog(  "Enter the number of Operation you want:\n"
                                                    + "1.First number - Second number\n"
                                                    + "2.Second number - First number\n"
                                                    + "3.Back\n");
        
        int selection2 = Integer.parseInt(s2);

            if(selection2==1){
                
                Store store = new Store();
                Subtract subtract =new Subtract(store.set1(), store.set2());
                subtract.subAndPrint(1);
            }
            else if(selection2==2){
                
                Store store = new Store();
                Subtract subtract =new Subtract(store.set1(), store.set2());
                subtract.subAndPrint(2);
            }   
            else if(selection2==3){
                
               selection= this.showMenu();
               this.operation(selection);
            }
        }
        else if(selection==3){
            
            
        }
            
        
    }
    
}
