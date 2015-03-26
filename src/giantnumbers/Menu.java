/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giantnumbers;

import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ali salmani
 */
public class Menu {
    
    
    private LinkedList link1;
    private LinkedList link2;
    
    public Menu(LinkedList link1, LinkedList link2){

        this.link1=link1;
        this.link2=link2;
            
    }
 /*   
    public void showNumbers(){
        
        for(int i=0; i<link1.size() ;i++)
            System.out.print(link1.get(i));
        
        
        
    }
*/    
    public int showMenu(){
        
        
        String s = JOptionPane.showInputDialog(  "Enter the number of Operation you want:\n"
                                                    + "1.Sum\n"
                                                    + "2.Subtract\n"
                                                    + "3.Multiplication\n"
                                                    + "4.Compare\n"
                                                    + "5.Is zero\n"
                                                    + "6.Exite");
        
        int selection = Integer.parseInt(s);
        
        return selection;
    }
    
    public void operation(int selection){
        
        if(selection == 1){
            
            Sum sum=new Sum(link1, link2);
            sum.sumAndPrint();
        }
        else if(selection == 2){
            
            String s2 = JOptionPane.showInputDialog(  "Enter the number of Operation you want:\n"
                                                    + "1.First number - Second number\n"
                                                    + "2.Second number - First number\n"
                                                    + "3.Back\n");
        
        int selection2 = Integer.parseInt(s2);

            if(selection2==1){
                
                Subtract subtract =new Subtract(link1, link2);
                subtract.subAndPrint(1);
            }
            else if(selection2==2){
                
                Subtract subtract =new Subtract(link1, link2);
                subtract.subAndPrint(2);
            }   
            else if(selection2==3){
                
               selection= this.showMenu();
               this.operation(selection);
            }
        }
        else if(selection==3){
            
            
        }
        else if(selection==4){
            
            Status status = new Status(link1, link2);
            status.compare();
        }
        else if(selection==5){
            
            Status status = new Status(link1, link2);
            status.isZero();
        }
        else if(selection==6){
            
            System.exit(0);
        }   
        else
            this.showMenu();
        
        int sel = this.showMenu();
        this.operation(sel);
    }

    public void setLink1(LinkedList link1) {
        this.link1 = link1;
    }

    public LinkedList getLink1() {
        return link1;
    }

    public void setLink2(LinkedList link2) {
        this.link2 = link2;
    }

    public LinkedList getLink2() {
        return link2;
    }
}
