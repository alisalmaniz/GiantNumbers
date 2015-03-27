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
        
        
        String s = JOptionPane.showInputDialog(   "Enter the number of Operation you want:\n"
                                                + "1.Sum\n"
                                                + "2.Subtract\n"
                                                + "3.Multiplication\n"
                                                + "4.Is zero\n"
                                                + "5.Less\n"
                                                + "6.Greater\n"
                                                + "7.Equal\n"
                                                + "8.Unequal\n"
                                                + "9.Less than or equal\n"
                                                + "10.Greater than or equal\n"
                                                + "11.Exite");
        
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
            
            Multiplication multiplication = new Multiplication(link1, link2);
            multiplication.multiplicationAndPrint();
        }
        else if(selection==4){
            
            Status status = new Status(link1, link2);
            status.isZero();
        }
        else if(selection==5){
            
            Status status = new Status(link1, link2);
            status.less();
        }
        else if(selection==6){
            
            Status status = new Status(link1, link2);
            status.greater();
        }
        else if(selection==7){
            
            Status status = new Status(link1, link2);
            status.equal();
        }
        else if(selection==8){
            
            Status status = new Status(link1, link2);
            status.unequal();
        }
        else if(selection==9){
            
            Status status = new Status(link1, link2);
            status.lessThanOrEqual();
        }
        else if(selection==10){
            
            Status status = new Status(link1, link2);
            status.greaterThanOrEqual();
        }
        else if(selection==11){
            
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
